package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacoste.galactic.table.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
}