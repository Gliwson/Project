package pl.project.project.services;

import pl.project.project.controllers.dtos.UserDTO;

public interface UserService {

    Long addUser(UserDTO userDTO);

}
