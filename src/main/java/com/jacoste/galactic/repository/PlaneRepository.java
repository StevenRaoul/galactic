package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacoste.galactic.table.Plane;

public interface PlaneRepository extends JpaRepository<Plane, Long> {
	
}