package com.jacoste.galactic.table;

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
	private String departureTime;
	private String arrivaleTime;
	private int departureAirport;
	private int arrivalAirport;
	private int plane;
	private int capacity;
	
	public Flight(int id, String departureCity, String arrivalCity, String departureTime, String arrivaleTime, 
			int departureAirport, int arrivalAirport, int plane, int capacity) {
		this.id = id;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
		this.arrivaleTime = arrivaleTime;
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

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivaleTime() {
		return arrivaleTime;
	}

	public void setArrivaleTime(String arrivaleTime) {
		this.arrivaleTime = arrivaleTime;
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
