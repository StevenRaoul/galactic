package com.jacoste.galactic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacoste.galactic.table.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
	
}