package com.jacoste.galactic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jacoste.galactic.table.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	Optional<User> findByEmail(String email);
}
