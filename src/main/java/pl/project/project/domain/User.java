package pl.project.project.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Collection;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String password;
    @Email
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String nick;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Role> role;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Project> projects;
}
