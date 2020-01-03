package pl.project.project.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    @Column(length = 1000)
    private String description;

    @ManyToOne
    private Board board;

}
