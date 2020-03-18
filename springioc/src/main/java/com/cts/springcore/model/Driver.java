package com.cts.springcore.model;

public class Driver {
	private String drivername;

	public Driver() {
		super();
		System.out.println("Default constructor called for Driver class");
	}

	public Driver(String drivername) {
		super();
		this.drivername = drivername;
		System.out.println("parameterized constructor called for Driver class");
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
		System.out.println("setter method called for Driver class");
	}

}
