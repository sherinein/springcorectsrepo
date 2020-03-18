package com.cts.springcore;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.springcore.model.Car;
import com.cts.springcore.model.Driver;

public class CarDemo {

	public static void main(String[] args) {
	//Resource r=new ClassPathResource("springioc.xml"); //	FileSystemResource
	
	//BeanFactory bf=new XmlBeanFactory(r);  // bf - container object 
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Car car1=(Car)ac.getBean("car1");// instance factory method
		
		//classname.method -->return object -> static factory method
		
		
		System.out.println("My car model is "+car1.getModel());
		System.out.println("My car color is "+car1.getColor());
		System.out.println("Driver name is  "+car1.getDriver().getDrivername());
		
		Car car=(Car)ac.getBean("car");
		System.out.println("My car model is "+car.getModel());
		System.out.println("My car color is "+car.getColor());
		
		Driver driver=(Driver)ac.getBean("driver");
		System.out.println("My Driver name is "+driver.getDrivername());

	}

}
