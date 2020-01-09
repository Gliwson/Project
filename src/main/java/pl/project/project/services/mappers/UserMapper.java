package pl.project.project.services.mappers;

import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.User;

public class UserMapper {

    public static User mapUserDtoToUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setLogin(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
