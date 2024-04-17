package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacoste.galactic.table.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}