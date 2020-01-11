package pl.project.project.controllers.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDTO {

    @NotBlank(message = "nie może być nullem")
    private String username;

    @NotBlank
    @Size(max = 4)
    private String password;

    @Email
    @NotBlank
    private String email;

}
