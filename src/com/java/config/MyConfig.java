package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.beans.Employee;

@Configuration
public class MyConfig {

	@Bean
	public Employee employee()
	{
		return new Employee();
	}
}
