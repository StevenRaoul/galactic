package com.jacoste.galactic.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.jacoste.galactic.table.User;



@Service
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	Optional<User> findByEmail(String email);
}
