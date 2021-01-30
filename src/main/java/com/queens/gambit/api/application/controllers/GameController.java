package com.queens.gambit.api.application.controllers;

import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.domain.game.GameService;
import com.queens.gambit.api.domain.game.converter.GameResponseConverter;
import io.swagger.api.GamesApi;
import io.swagger.model.GameResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@CrossOrigin
@RestController
public class GameController implements GamesApi {

    @Inject
    private GameService gameService;

    @Inject
    private GameResponseConverter gameResponseConverter;

    @Override
    public ResponseEntity <GameResponse> getGamesByFullName(@PathVariable("fullName") String fullName) {
        Game game = gameService.findGameByFullName(fullName);
        GameResponse gameResponses = gameResponseConverter.convert(game);
        return ResponseEntity.ok(gameResponses);
    }
}
