package com.java.beans;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
