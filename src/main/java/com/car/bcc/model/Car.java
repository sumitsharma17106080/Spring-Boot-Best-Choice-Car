package com.car.bcc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private int id;
	private String brand;
	private String model;
	private int year;
	private int noOfKms;
	private int price;
	private String fuel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNoOfKms() {
		return noOfKms;
	}
	public void setNoOfKms(int noOfKms) {
		this.noOfKms = noOfKms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String brand, String model, int year, int noOfKms, int price, String fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.noOfKms = noOfKms;
		this.price = price;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", noOfKms=" + noOfKms
				+ ", price=" + price + ", fuel=" + fuel + "]";
	}
	
	

	
	

}
