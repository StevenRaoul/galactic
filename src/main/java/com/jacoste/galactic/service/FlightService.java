package com.jacoste.galactic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

}
