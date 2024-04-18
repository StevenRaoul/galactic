package com.jacoste.galactic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import com.jacoste.galactic.service.FlightService;
import com.jacoste.galactic.table.Flight;

@Controller
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public Flight createFlight(@RequestBody Flight vol) {
        return flightService.createFlight(vol);
    }

    @GetMapping
    public List<Flight> getAllFights() {
        return flightService.getAllFights();
    }
    
    public List<Flight> getFlight(@RequestParam String arrivalCity,
            @RequestParam LocalDateTime departureTime,
            @RequestParam LocalDateTime arrivalTime) {
    	return flightService.getFlight(arrivalCity, departureTime, arrivalTime);
    }

}
