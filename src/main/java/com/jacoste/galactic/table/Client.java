package com.jacoste.galactic.table;

import jakarta.persistence.Entity;

@Entity
public class Client extends User {

	private int passport;
	
	public Client(int id, String firstName, String lastName, String adress, String email, int phone, String birthday, int passport) {
		super(id, firstName, lastName, adress, email, phone, birthday);
		this.passport = passport;
	}

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}
	
}
