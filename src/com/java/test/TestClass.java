package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.beans.Employee;
import com.java.config.MyConfig;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee emp=(Employee)context.getBean(Employee.class);
		
		System.out.println(emp.getId());
	}

}
