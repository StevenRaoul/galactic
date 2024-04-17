package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacoste.galactic.table.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long> {
	
}
