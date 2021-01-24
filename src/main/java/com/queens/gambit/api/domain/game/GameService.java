package com.queens.gambit.api.domain.game;

import com.queens.gambit.api.application.MessageConstants;
import com.queens.gambit.api.application.exception.ResourceNotFoundException;
import com.queens.gambit.api.domain.user.User;
import com.queens.gambit.api.infrastructure.persistence.GameRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Inject
    GameRepository gameRepository;

    public Game findGameByFullName(String fullName){

        Optional<Game> gameOptional = gameRepository.findById(fullName);

        if(!gameOptional.isPresent()) {
            throw new ResourceNotFoundException(String.format(MessageConstants.MESSAGE_GAME_NOT_FOUND, fullName));
        }

        return gameOptional.get();
    }
}
