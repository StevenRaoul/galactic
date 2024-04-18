package com.jacoste.galactic.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jacoste.galactic.table.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
	@Query("INSERT INTO reservation (clientId, flightId " + 
			"SELECT c.id, f.id FROM client c, flight f " + 
			"WHERE c.passport = ?3 " +
			"AND c.firstName = ?1 " +
			"AND c.lastName = ?2 " +
			"AND c.birthday = ?4 " +
			"AND v.departureCity = ?5 " +
			"AND v.arrivalCity = ?6 " +
			"AND v.departureTime = ?7 " +
			"AND v.arrivalTime = ?8, nativeQuery = true)")
    Reservation createReservation(String firstName, String lastName, int passport, LocalDateTime birthday, String departureCity, 
    		String arrivalCity, LocalDateTime departureDate, LocalDateTime arrivalDate);
	
}