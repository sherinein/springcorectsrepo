package com.cts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.JavaConfig;
import com.cts.model.Car;


public class CarDemo {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Car car=(Car)ac.getBean("car");// instance factory method
		Car car=ac.getBean(Car.class);
		System.out.println(car.getDriver().getDrivername());
		//classname.method -->return object -> static factory method
		
		//System.out.println(car.getDriver().getDrivername());	
		

	}

}
