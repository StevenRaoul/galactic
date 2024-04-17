package com.jacoste.galactic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    // Autres méthodes pour modifier, supprimer, etc.
}
