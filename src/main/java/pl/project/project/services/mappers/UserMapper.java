package pl.project.project.services.mappers;

import com.google.common.collect.Sets;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.project.project.controllers.dtos.UserDTO;
import pl.project.project.domain.Authority;
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
        user.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
        Authority authority = new Authority();
        authority.setAuthority("ADMIN");
        authority.setUser(user);
        user.setAuthoritySet(Sets.newHashSet(authority));
        return user;
    }
}
