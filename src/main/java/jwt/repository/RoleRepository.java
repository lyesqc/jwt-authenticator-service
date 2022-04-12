package jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jwt.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
