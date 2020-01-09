package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
