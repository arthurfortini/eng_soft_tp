package com.queens.gambit.api.domain.user;

import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.infrastructure.persistence.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> responseList = userRepository.findAll();

        for(User u: responseList)
        {
            for(Game g: u.getUserOwnedGames())
            {
                System.out.println(g.getFullName());
            }
        }
        return Optional.ofNullable(userRepository.findAll()).orElse(new ArrayList<>());
    }
}
