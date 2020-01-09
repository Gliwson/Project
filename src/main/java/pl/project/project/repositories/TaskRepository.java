package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
