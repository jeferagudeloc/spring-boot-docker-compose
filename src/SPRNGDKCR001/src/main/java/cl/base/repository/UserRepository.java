package cl.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import cl.base.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
}
