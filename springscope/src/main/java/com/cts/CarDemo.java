package com.cts;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Car;
import com.cts.model.Car;


public class CarDemo {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Car car1=(Car)ac.getBean("car1");
		
		System.out.println(car1.getColor());
		Car car2=(Car)ac.getBean("car1");
		System.out.println(car2.getColor());
	}

}
