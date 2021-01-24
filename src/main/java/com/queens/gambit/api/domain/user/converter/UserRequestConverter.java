package com.queens.gambit.api.domain.user.converter;

import com.queens.gambit.api.domain.user.DaysOfWeek;
import com.queens.gambit.api.domain.user.User;
import io.swagger.model.UserRequest;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserRequestConverter
{
    public User convert(UserRequest request)
    {
        return new User(
                request.getLogin(),
                request.getFullName(),
                request.getAge(),
                request.getCityName(),
                request.getCellPhone(),
                request.getHomePhone(),
                request.getInsta(),
                request.getFace(),
                request.getTwitter(),
                DaysOfWeek.valueOf(request.getAvailableIn()),
                request.getPassword(),
                new Date()
        );
    }
}
