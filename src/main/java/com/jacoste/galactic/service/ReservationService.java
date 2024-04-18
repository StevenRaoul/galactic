package com.jacoste.galactic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.jacoste.galactic.repository.ClientRepository;
import com.jacoste.galactic.repository.FlightRepository;
import com.jacoste.galactic.repository.ReservationRepository;
import com.jacoste.galactic.table.Client;
import com.jacoste.galactic.table.Flight;
import com.jacoste.galactic.table.Reservation;

@Service

public class ReservationService {
	

    @Autowired
    private ReservationRepository reservationRepository;
    private FlightRepository flightRepository;
    private ClientRepository clientRepository;

    public void createReservation(Flight flightDetails, Client clientDetails) {
    	Flight flight = flightRepository.findById((long) flightDetails.getId()).orElse(null);
    	Client client = clientRepository.findById((long) clientDetails.getId()).orElse(null);
    	Reservation reservation = new Reservation();
    	if (flightDetails != null && clientDetails != null) {
            reservation.setFlight(flightDetails.getId());
            reservation.setClient(clientDetails.getId());
            reservationRepository.createReservation(
            		client.getFirstName(),
            		client.getLastName(),
            		client.getPassport(),
            		client.getBirthday(),
            		flight.getDepartureCity(),
            		flight.getArrivalCity(),
            		flight.getDepartureTime(),
            		flight.getArrivaleTime());
        }
    }
    

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }
    
    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation != null) {
            reservation.setFlight(reservationDetails.getFlight());
            reservation.setClient(reservationDetails.getClient());
            return reservationRepository.save(reservation);
        }
        return null;
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

}
