package pl.project.project.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    private String nick;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    private Set<Role> role;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> project;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Authority> authoritySet;

//    @Transient
//    private int nrRole;
//
//    @Transient
//    private String newPassword;
}
