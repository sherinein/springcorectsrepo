package com.cts.model;

import org.springframework.beans.factory.annotation.Value;

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
    @Value("Raja")
	public void setDrivername(String drivername) {
		this.drivername = drivername;
		System.out.println("driver name injected");

	}
}
