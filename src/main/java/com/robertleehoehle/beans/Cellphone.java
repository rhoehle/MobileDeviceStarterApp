package com.robertleehoehle.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cellphone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	private String manufacturer;
	private String model;
	private double cost;
	@Autowired
	private Owner owner;
	
	public Cellphone() {
		super();
	}

	public Cellphone(String manufacturer) {
		super();
		this.manufacturer = manufacturer;
	}

	public Cellphone(String manufacturer, String model, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.cost = cost;
	}

	public Cellphone(int phoneId, String manufacturer, String model, double cost) {
		super();
		this.phoneId = phoneId;
		this.manufacturer = manufacturer;
		this.model = model;
		this.cost = cost;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Cellphone [phoneId=" + phoneId + ", manufacturer=" + manufacturer + ", model=" + model + ", cost="
				+ cost + ", owner=" + owner + "]";
	}

}
