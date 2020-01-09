package pl.project.project.services.implementation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.User;
import pl.project.project.repositories.UserRepository;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    @Test
    void shouldBeAbleToAddedUser() {
        //given
        UserDTO userDTO = new UserDTO();
        User user = new User();
        given(userRepository.save(user)).willReturn(user);
        //when
        Long aLong = userServiceImpl.addUser(userDTO);
        //then
        then(userRepository).should().save(user);


    }
}
