package com.jacoste.galactic.table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plane {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String company;
	private String model;
	private String buildDate;
	
	public Plane(int id, String company, String model, String buildDate) {
		this.id = id;
		this.company = company;
		this.model = model;
		this.buildDate = buildDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

}
