package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.Sprint;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
