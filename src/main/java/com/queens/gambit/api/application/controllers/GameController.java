package com.queens.gambit.api.application.controllers;

import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.domain.game.GameService;
import com.queens.gambit.api.domain.user.converter.GameResponseConverter;
import io.swagger.api.GamesApi;
import io.swagger.model.GameResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class GameController implements GamesApi {

    @Inject
    private GameService gameService;

    @Inject
    private GameResponseConverter gameResponseConverter;

    @Override
    public ResponseEntity<List<GameResponse>> getGames() {

        List<Game> gameList = gameService.getAllGames();
        List<GameResponse> gameResponses = gameResponseConverter.convertListGames(gameList);
        return ResponseEntity.ok(gameResponses);
    }
}
