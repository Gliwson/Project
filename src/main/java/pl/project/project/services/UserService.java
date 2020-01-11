package pl.project.project.services;

import pl.project.project.controllers.dtos.UserDTO;

import java.util.List;

public interface UserService {

    Long addUser(UserDTO userDTO);

    List<UserDTO> findAll();

    UserDTO findById(Long id);

    UserDTO updateUser(Long id, UserDTO userDTO);

    void deleteUserById(Long id);
}
