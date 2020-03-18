package com.cts.springcore.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Car {
	private String model;
	private String color;
		
	public Car() {
		super();
		System.out.println("Default constructor called");
	}
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("parameterized constructor called");
	}
	public String getModel() {
		return model;
	}
	@Value("BMW")
	public void setModel(String model) {
		this.model = model;
		System.out.println("inject model value through setter injection");
	}
	public String getColor() {
		return color;
	}
	@Value("White")
	public void setColor(String color) {
		this.color = color;
		System.out.println("inject color value through setter injection");
	}
	
	@Override
	public String toString() {
		return "this is my car object";
	}
	
	
}
