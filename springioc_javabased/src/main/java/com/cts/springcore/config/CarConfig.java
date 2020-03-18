package com.cts.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cts.springcore.model.Car;

@Configuration
public class CarConfig {
	@Bean("car1")
	public Car car() {
		Car car=new Car();
		return car;
	}

}
