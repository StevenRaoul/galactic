package com.jacoste.galactic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.jacoste.galactic.service.PlaneService;
import com.jacoste.galactic.table.Plane;

@RestController
@RequestMapping("/plane")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @PostMapping
    public Plane createPlane(@RequestBody Plane plane) {
        return planeService.createPlane(plane);
    }

    @GetMapping("/{id}")
    public Plane getPlaneById(@PathVariable Long id) {
        return planeService.getPlaneById(id);
    }

    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @PutMapping("/{id}")
    public Plane updatePlane(@PathVariable Long id, @RequestBody Plane planeDetails) {
        return planeService.updatePlane(id, planeDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable Long id) {
        planeService.deletePlane(id);
    }
}
