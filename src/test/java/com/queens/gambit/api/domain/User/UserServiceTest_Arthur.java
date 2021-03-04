package com.queens.gambit.api.domain.User;

import com.queens.gambit.api.application.exception.ResourceNotFoundException;
import com.queens.gambit.api.domain.user.User;
import com.queens.gambit.api.domain.user.UserService;
import com.queens.gambit.api.infrastructure.persistence.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserServiceTest_Arthur {

    private UserService service;
    private UserRepository userRepository;

    @Before
    public void setUp() {
        this.service = new UserService();
        this.userRepository = PowerMockito.mock(UserRepository.class);

        Whitebox.setInternalState(service, "userRepository", userRepository);
    }

    @Test
    public void shouldThrowResourceNotFoundExceptionWhenUserNotFound(){
        PowerMockito.when(userRepository.findById("teste")).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service.findUserByLogin("teste"))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage(String.format("Couldn't find User with login %s", "teste"));
    }

    @Test
    public void shouldReturnUserInstanceWhenUserFound(){
        PowerMockito.when(userRepository.findById("teste")).thenReturn(Optional.of(new User()));
        Assert.assertTrue(service.findUserByLogin("teste") instanceof User);
    }

    @Test
    public void shouldReturnUserInstanceWithCorrectLoginWhenUserFound(){
        User user = new User();
        user.setLogin("teste");

        PowerMockito.when(userRepository.findById("teste")).thenReturn(Optional.of(user));
        User ret = service.findUserByLogin("teste");
        Assert.assertEquals(user.getLogin(), ret.getLogin());
    }

    @Test
    public void shouldCallRepositorySaveMethodOnUserWithCorrectData(){
        User user = new User();
        user.setLogin("teste");

        Mockito.when(userRepository.save(Mockito.any(User.class)))
                .thenAnswer(i -> i.getArguments()[0]);

        User savedUser = service.saveUser(user);
        assertThat(savedUser.getLogin()).isEqualTo("teste");
    }

}
