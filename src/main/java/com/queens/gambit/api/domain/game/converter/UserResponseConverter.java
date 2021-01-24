package com.queens.gambit.api.domain.game.converter;

import com.queens.gambit.api.domain.user.User;
import io.swagger.model.UserResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserResponseConverter {

    public List<UserResponse> convertListUsers(List<User> users){

        return users.stream().map(m -> convert(m)).collect(Collectors.toList());
    }

    public UserResponse convert(User user){

        UserResponse userResponse = new UserResponse();
        userResponse.setLogin(user.getLogin());
        userResponse.setAge(user.getAge());
        userResponse.setCityName(user.getCityName());
        userResponse.setFullName(user.getFullName());

        return userResponse;
    }
}
