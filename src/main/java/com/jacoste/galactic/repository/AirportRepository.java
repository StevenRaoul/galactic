package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacoste.galactic.table.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
	
}
