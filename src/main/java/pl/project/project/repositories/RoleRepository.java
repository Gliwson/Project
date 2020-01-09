package pl.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.project.project.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
