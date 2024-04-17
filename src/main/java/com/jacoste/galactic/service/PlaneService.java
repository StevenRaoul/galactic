package com.jacoste.galactic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.jacoste.galactic.repository.PlaneRepository;
import com.jacoste.galactic.table.Plane;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    public Plane createPlane(Plane plane) {
        return planeRepository.save(plane);
    }

    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }

    public Plane getPlaneById(Long id) {
        return planeRepository.findById(id).orElse(null);
    }

    public Plane updatePlane(Long id, Plane planeDetails) {
        Plane plane = planeRepository.findById(id).orElse(null);
        if (plane != null) {
            plane.setCompany(planeDetails.getCompany());
            plane.setModel(planeDetails.getModel());
            plane.setBuildDate(planeDetails.getBuildDate());
            return planeRepository.save(plane);
        }
        return null;
    }

    public void deletePlane(Long id) {
        planeRepository.deleteById(id);
    }
}
