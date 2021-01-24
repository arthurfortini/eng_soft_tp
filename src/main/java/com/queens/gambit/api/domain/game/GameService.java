package com.queens.gambit.api.domain.game;

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

    public List<Game> getAllGames() {
        return Optional.ofNullable(gameRepository.findAll()).orElse(new ArrayList<>());
    }
}
