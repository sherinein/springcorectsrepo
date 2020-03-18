package com.cts;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Emp;
import com.cts.model.EmpCollection;

public class CollectionDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		EmpCollection empcollection=ac.getBean(EmpCollection.class);
		List<Emp> list=empcollection.getList();
		Emp e=list.get(0);
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		Emp e1=list.get(1);
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
	}

}
