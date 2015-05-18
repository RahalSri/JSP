package com.rahal.model;

public class Person {
	private String name;

	public Person(String name){
		setName(name);
	}
	
	public Person(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
