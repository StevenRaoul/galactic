package com.jacoste.galactic.table;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String departureCity;
	private String arrivalCity;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private int departureAirport;
	private int arrivalAirport;
	private int plane;
	private int capacity;
	
	public Flight(int id, String departureCity, String arrivalCity, LocalDateTime departureTime, LocalDateTime arrivaleTime, 
			int departureAirport, int arrivalAirport, int plane, int capacity) {
		this.id = id;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivaleTime;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.plane = plane;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivaleTime() {
		return arrivalTime;
	}

	public void setArrivaleTime(LocalDateTime arrivaleTime) {
		this.arrivalTime = arrivaleTime;
	}

	public int getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(int departureAirport) {
		this.departureAirport = departureAirport;
	}

	public int getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(int arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public int getPlane() {
		return plane;
	}

	public void setPlane(int plane) {
		this.plane = plane;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
