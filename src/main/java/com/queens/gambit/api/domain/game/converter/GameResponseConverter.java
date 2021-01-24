package com.queens.gambit.api.domain.game.converter;

import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.domain.user.converter.UserResponseConverter;
import io.swagger.model.GameResponse;
import io.swagger.model.ReducedGameResponse;
import io.swagger.model.UserReducedResponse;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameResponseConverter {

    @Inject
    private UserResponseConverter userResponseConverter;

    public GameResponse convert(Game game) {

        GameResponse gameResponse = new GameResponse();

        gameResponse.setFullName(game.getFullName());
        gameResponse.setDeveloper(game.getDeveloper());
        gameResponse.setLaunchYear(game.getLaunchYear());

        List<UserReducedResponse> reducedPlayers = game.getWantedBy().stream().map(g -> userResponseConverter.convertToReduced(g)).collect(Collectors.toList());
        List<UserReducedResponse> reducedOwners = game.getOwnedBy().stream().map(g -> userResponseConverter.convertToReduced(g)).collect(Collectors.toList());

        gameResponse.setOwners(reducedOwners);
        gameResponse.setPlayers(reducedPlayers);

        return gameResponse;
    }

    public ReducedGameResponse convertToReduced(Game game)
    {
        ReducedGameResponse reducedGameResponse = new ReducedGameResponse();

        reducedGameResponse.setFullName(game.getFullName());

        return reducedGameResponse;
    }

}
