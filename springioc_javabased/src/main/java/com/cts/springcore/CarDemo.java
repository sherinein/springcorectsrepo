package com.cts.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.config.CarConfig;
import com.cts.springcore.model.Car;


public class CarDemo {

	public static void main(String[] args) {
	
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(CarConfig.class);
		Car car=(Car)ac.getBean("car1");
		System.out.println("My car model is "+car.getModel());
		System.out.println("My car color is "+car.getColor());
		/*
		Car car1=(Car)ac.getBean("car1");// instance factory method
			
		System.out.println("My car model is "+car1.getModel());
		System.out.println("My car color is "+car1.getColor());
		*/
		
		

	}

}
