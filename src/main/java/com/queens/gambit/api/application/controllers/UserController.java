package com.queens.gambit.api.application.controllers;

import com.queens.gambit.api.domain.user.User;
import com.queens.gambit.api.domain.user.UserService;
import com.queens.gambit.api.domain.user.converter.UserRequestConverter;
import com.queens.gambit.api.domain.user.converter.UserResponseConverter;
import io.swagger.annotations.ApiParam;
import io.swagger.api.UsersApi;
import io.swagger.model.UserLoginRequest;
import io.swagger.model.UserRequest;
import io.swagger.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController implements UsersApi {

    @Inject
    private UserService userService;

    @Inject
    private UserResponseConverter userResponseConverter;

    @Inject
    private UserRequestConverter userRequestConverter;

    @Override
    public ResponseEntity<UserResponse> getUserByLogin(@PathVariable("login") String login) {

        User user = userService.findUserByLogin(login);
        UserResponse userResponses = userResponseConverter.convert(user);
        return ResponseEntity.ok(userResponses);
    }

    @Override
    public ResponseEntity<Void> saveUser(@Valid @RequestBody UserRequest user)
    {
        User userToBeSaved = userRequestConverter.convert(user);
        userService.saveUser(userToBeSaved);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> loginUser(@Valid @RequestBody UserLoginRequest user)
    {
        boolean isLoginSucessful = userService.loginUser(user);
        if(isLoginSucessful)
        {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
