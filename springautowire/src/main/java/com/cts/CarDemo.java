package com.cts;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Car;
import com.cts.model.Car1;


public class CarDemo {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Car1 car1=(Car1)ac.getBean("car1");
		
		System.out.println(car1.getColor());
		Car1 car2=(Car1)ac.getBean("car1");
		System.out.println(car2.getColor());
	}

}
