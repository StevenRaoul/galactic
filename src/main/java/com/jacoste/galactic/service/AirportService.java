package com.jacoste.galactic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.jacoste.galactic.repository.AirportRepository;
import com.jacoste.galactic.table.Airport;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    public Airport updateAirport(Long id, Airport airportDetails) {
        Airport airport = airportRepository.findById(id).orElse(null);
        if (airport != null) {
            airport.setName(airportDetails.getName());
            airport.setCountry(airportDetails.getCountry());
            airport.setCity(airportDetails.getCity());
            return airportRepository.save(airport);
        }
        return null;
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}

