package pl.project.project.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 6, max = 15, message = "Login must be between 6 and 15 characters")
    @NotBlank(message = "Login cannot be null")
    @Column(nullable = false, unique = true)
    private String login;

    @Size()
    @NotBlank(message = "Password cannot be null")
    @Column(nullable = false)
    private String password;

    @Email
    @NotBlank(message = "Email cannot be null")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Nick cannot be null")
    @Column(nullable = false)
    private String nick;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    private Set<Role> role;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> project;

    @Transient
    private int nrRole;

    @Transient
    private String newPassword;
}
