package com.jacoste.galactic.table;

import jakarta.persistence.Entity;

@Entity
public class Employe extends User {
	
	private int badgeNumber;

	public Employe(int id, String firstName, String lastName, String adress, String email, int phone, String birthday, int badgeNumber) {
		super(id, firstName, lastName, adress, email, phone, birthday);
		this.badgeNumber = badgeNumber;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

}
