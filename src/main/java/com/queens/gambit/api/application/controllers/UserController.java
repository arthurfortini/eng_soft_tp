package com.queens.gambit.api.application.controllers;

import com.queens.gambit.api.domain.game.converter.UserResponseConverter;
import com.queens.gambit.api.domain.user.User;
import com.queens.gambit.api.domain.user.UserService;
import io.swagger.api.UsersApi;
import io.swagger.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class UserController implements UsersApi {

    @Inject
    private UserService userService;

    @Inject
    private UserResponseConverter userResponseConverter;

    @Override
    public ResponseEntity<List<UserResponse>> getUsers() {

        List<User> userList = userService.getAllUsers();
        List<UserResponse> userResponses = userResponseConverter.convertListUsers(userList);
        return ResponseEntity.ok(userResponses);
    }
}
