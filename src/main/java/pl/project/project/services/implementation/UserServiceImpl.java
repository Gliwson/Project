package pl.project.project.services.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.User;
import pl.project.project.repositories.UserRepository;
import pl.project.project.services.UserService;
import pl.project.project.services.mappers.UserMapper;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public Long addUser(UserDTO userDTO) {
        User user = Optional.ofNullable(userDTO)
                .map(UserMapper::mapUserDtoToUser)
                .orElseThrow(() -> new NullPointerException("UserDto is null"));
        User save = userRepository.save(user);
        return save.getId();
    }
}
