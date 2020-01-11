package pl.project.project.services.mappers;

import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.User;

import java.util.Optional;

public class UserMapper {

    public static User mapUserDtoToUser(UserDTO userDTO) {
        return Optional.ofNullable(userDTO)
                .map(UserMapper::getUser)
                .orElse(null);
    }

    private static User getUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
