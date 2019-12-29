package pl.project.project.domain;

import lombok.Data;
import pl.project.project.domain.enums.Level;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Level level;

    @OneToMany
    private List<ProjectUser> projectUser;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Collection<User> user;

}
