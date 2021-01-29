package com.queens.gambit.api.domain.user.converter;

import com.queens.gambit.api.domain.game.converter.GameResponseConverter;
import com.queens.gambit.api.domain.user.User;
import io.swagger.model.ReducedGameResponse;
import io.swagger.model.UserReducedResponse;
import io.swagger.model.UserResponse;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserResponseConverter {

    @Inject
    private GameResponseConverter gameResponseConverter;

    public List<UserResponse> convertListUsers(List<User> users){

        return users.stream().map(m -> convert(m)).collect(Collectors.toList());
    }

    public UserResponse convert(User user){

        UserResponse userResponse = new UserResponse();
        userResponse.setLogin(user.getLogin());
        userResponse.setAge(user.getAge());
        userResponse.setCityName(user.getCityName());
        userResponse.setFullName(user.getFullName());
        userResponse.setAvailableIn(user.getAvailableIn().name());
        userResponse.setCellPhone(user.getCellphone());
        userResponse.setCreatedAt(user.getCreatedAt().toString());
        userResponse.setFace(user.getFace());
        userResponse.setHomePhone(user.getHomephone());
        userResponse.setInsta(user.getInsta());
        userResponse.setTwitter(user.getTwitter());

        List<ReducedGameResponse> reducedOwnedGames = user.getUserOwnedGames().stream().map(g -> gameResponseConverter.convertToReduced(g)).collect(Collectors.toList());
        List<ReducedGameResponse> reducedWantedGames = user.getUserWantedGames().stream().map(g -> gameResponseConverter.convertToReduced(g)).collect(Collectors.toList());
        List<UserReducedResponse> userFriendship = user.getFriends().stream().map(f -> convertToReduced(f)).collect(Collectors.toList());

        userResponse.setUserOwnedGames(reducedOwnedGames);
        userResponse.setUserWantedGames(reducedWantedGames);
        userResponse.setUserFriends(userFriendship);

        return userResponse;
    }

    public UserReducedResponse convertToReduced(User user)
    {
        UserReducedResponse reducedUserResponse = new UserReducedResponse();

        reducedUserResponse.setFullName(user.getFullName());
        reducedUserResponse.setLogin(user.getLogin());

        return reducedUserResponse;
    }
}
