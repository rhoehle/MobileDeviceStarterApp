package com.robertleehoehle.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	
	private String name;
	private String phoneNumber;
	
	public Owner() {
		super();
	}

	public Owner(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
