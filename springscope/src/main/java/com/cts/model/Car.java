package com.cts.model;

public class Car {
	private String color;

	public Car() {
		super();
		System.out.println("car object is created");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
