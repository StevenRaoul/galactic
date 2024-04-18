package com.jacoste.galactic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import com.jacoste.galactic.repository.FlightRepository;
import com.jacoste.galactic.table.Flight;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFights() {
        return flightRepository.findAll();
    }
    
    public List<Flight> getFlight(String arrival, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        return flightRepository.findByArrivalAndTime(arrival, departureTime, arrivalTime);
    }

}
