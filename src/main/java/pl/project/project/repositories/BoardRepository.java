package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
