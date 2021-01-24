package com.queens.gambit.api.domain.user;

import com.queens.gambit.api.application.MessageConstants;
import com.queens.gambit.api.application.exception.PersistenceException;
import com.queens.gambit.api.application.exception.ResourceAlreadyExistsException;
import com.queens.gambit.api.application.exception.ResourceNotFoundException;
import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.infrastructure.persistence.UserRepository;
import io.swagger.model.UserLoginRequest;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Inject
    UserRepository userRepository;

    public User findUserByLogin(String login){

        Optional<User> userOptional = userRepository.findById(login);

        if(!userOptional.isPresent()) {
            throw new ResourceNotFoundException(String.format(MessageConstants.MESSAGE_USER_NOT_FOUND, login));
        }

        return userOptional.get();
    }

    public boolean loginUser(UserLoginRequest loginRequest)
    {
        User user = findUserByLogin(loginRequest.getLogin());
        return user.getPassword().equals(loginRequest.getPassword());
    }

    public User saveUser(User user) {

        try
        {
            Optional<User> userOptional = userRepository.findById(user.getLogin());

            if(userOptional.isPresent()) {
                throw new ResourceAlreadyExistsException(String.format(MessageConstants.MESSAGE_USER_ALREADY_PERSISTED,
                        user.getLogin()));
            }

            User savedUser = this.userRepository.save(user);
            return savedUser;
        }
        catch (Exception e) {

            throw new PersistenceException(String.format(MessageConstants.MESSAGE_ERROR_PERSISTING_MACHINE,
                    user.getLogin()));
        }
    }
}
