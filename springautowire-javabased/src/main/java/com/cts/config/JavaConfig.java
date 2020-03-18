package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cts.model.Car;
import com.cts.model.Driver;

@Configuration
public class JavaConfig {
		@Scope("prototype")
		@Bean
		public Car car() {
			Car car=new Car();
			return car;
		}
		@Bean
		public Driver driver() {
			Driver driver=new Driver();
			return driver;
		}
}
