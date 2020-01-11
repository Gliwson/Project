package pl.project.project.services.mappers;


import pl.project.project.domain.User;
import pl.project.project.security.CustomUserDetails;

public class UserDetailsMapper {

    public static CustomUserDetails mapUserToUserDetails(User user) {
        if (user == null) {
            return null;
        }
        CustomUserDetails customUserDetails = new CustomUserDetails();
        customUserDetails.setUsername(user.getUsername());
        customUserDetails.setEmail(user.getEmail());
        customUserDetails.setPassword(user.getPassword());
        customUserDetails.setAuthoritySet(user.getAuthoritySet());

        return customUserDetails;
    }
}
