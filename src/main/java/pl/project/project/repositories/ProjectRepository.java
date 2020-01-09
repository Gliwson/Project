package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
