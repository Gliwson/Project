package pl.project.project.services;

import org.springframework.stereotype.Service;
import pl.project.project.controllers.dtos.UserDTO;

@Service
public interface UserService {

    Long addUser(UserDTO userDTO);

}
