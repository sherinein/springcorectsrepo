package com.cts.model;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	private String color;

	public Car() {
		super();
		System.out.println("car object is created");
	}

	public String getColor() {
		return color;
	}
	@Value("Red")
	public void setColor(String color) {
		this.color = color;
	}
}
