package com.queens.gambit.api.domain.user.converter;

import com.queens.gambit.api.domain.game.Game;
import io.swagger.model.GameResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameResponseConverter {

    public List<GameResponse> convertListGames(List<Game> games){

        return games.stream().map(m -> convert(m)).collect(Collectors.toList());
    }

    public GameResponse convert(Game game) {

        GameResponse gameResponse = new GameResponse();

        gameResponse.setFullName(game.getFullName());
        gameResponse.setDeveloper(game.getDeveloper());
        gameResponse.setLaunchYear(game.getLaunchYear());

        return gameResponse;
    }
}
