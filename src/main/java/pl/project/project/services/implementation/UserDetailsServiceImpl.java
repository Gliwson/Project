package pl.project.project.services.implementation;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.project.project.domain.User;
import pl.project.project.repositories.UserRepository;
import pl.project.project.security.CustomUserDetails;
import pl.project.project.services.mappers.UserDetailsMapper;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("invalid username or password");
        }

        CustomUserDetails customUserDetails = UserDetailsMapper.mapUserToUserDetails(user);
        return customUserDetails;
    }

}
