package com.jacoste.galactic.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jacoste.galactic.table.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
	
	@Query("SELECT f FROM Flight f WHERE f.arrivalCity = ?1 AND f.departureTime BETWEEN ?2 AND ?3")
    List<Flight> findByArrivalAndTime(String arrivalCity, LocalDateTime departureTime, LocalDateTime arrivalTime);
	
}