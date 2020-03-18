package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cts.model.Car;

@Configuration
public class CarConfig {
	@Scope("prototype")
	@Bean("car1")
	public Car mycar() {
		Car car=new Car();
		return car;
	}
}
