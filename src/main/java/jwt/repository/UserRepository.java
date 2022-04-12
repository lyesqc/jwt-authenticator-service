package jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jwt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	public User findByUsername(String username); 
}
