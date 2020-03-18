package com.cts.model;

public class Driver {
	private String drivername;

	public Driver() {
		super();
		System.out.println("Driver Object created");
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
		System.out.println("driver name injected");

	}
}
