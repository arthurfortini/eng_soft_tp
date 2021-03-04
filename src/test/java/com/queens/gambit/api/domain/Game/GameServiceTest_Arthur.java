package com.queens.gambit.api.domain.Game;

import com.queens.gambit.api.application.exception.ResourceNotFoundException;
import com.queens.gambit.api.domain.game.Game;
import com.queens.gambit.api.domain.game.GameService;
import com.queens.gambit.api.infrastructure.persistence.GameRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameServiceTest_Arthur {

    private GameService service;
    private GameRepository gameRepository;

    @Before
    public void setUp() {
        this.service = new GameService();
        this.gameRepository = PowerMockito.mock(GameRepository.class);

        Whitebox.setInternalState(service, "gameRepository", gameRepository);
    }

    @Test
    public void shouldThrowResourceNotFoundExceptionWhenGameNotFound(){
        PowerMockito.when(gameRepository.findById("teste")).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service.findGameByFullName("teste"))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(String.format("Couldn't find Game with name %s", "teste"));
    }

    @Test
    public void shouldReturnGameInstanceWhenGameFound() {
        PowerMockito.when(gameRepository.findById("teste")).thenReturn(Optional.of(new Game()));
        Assert.assertTrue(service.findGameByFullName("teste") instanceof Game);
    }

}
