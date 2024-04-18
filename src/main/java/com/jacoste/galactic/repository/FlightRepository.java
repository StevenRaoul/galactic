package com.jacoste.galactic.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jacoste.galactic.table.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	@Query("SELECT f FROM Flight f WHERE f.arrival = ?1 AND f.departureDateTime BETWEEN ?2 AND ?3")
    List<Flight> findByArrivalAndTime(String arrival, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime);
	
}