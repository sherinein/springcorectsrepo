package com.cts.model;

public class Car {
	
	private Driver driver;	
	
	public Car(Driver driver) {
		super();
		System.out.println("driver object injected by constructor");
		this.driver = driver;
	}


	public Car() {
		super();
		System.out.println("car object created");
	}
	
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
		System.out.println("driver object injected");
	}
	@Override
	public String toString() {
		return "this is my car object";
	}
	
	
}
