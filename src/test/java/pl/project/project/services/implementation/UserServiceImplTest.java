package pl.project.project.services.implementation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.User;
import pl.project.project.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.never;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepository userRepository;

    @Test
    void shouldBeAbleToAddedUser() {
        //given
        UserDTO userDTO = new UserDTO();
        User user = new User();
        given(userRepository.save(user)).willReturn(user);
        //when
        userServiceImpl.addUser(userDTO);
        //then
        then(userRepository).should().save(user);
    }

    @Test
    void theAddUserMethodShouldThrowExceptionIfUserDtoIsNull() {
        //given
        //when
        //then
        assertThrows(NullPointerException.class, () -> userServiceImpl.addUser(null));
        then(userRepository).should(never()).save(any());


    }
}
