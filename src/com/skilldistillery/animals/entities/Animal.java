package com.skilldistillery.animals.entities;

import com.skilldistillery.animals.app.Sanctuary;

public class Animal extends Sanctuary {
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void makeNoise() {
		
	}
	public void eat(int amount) {
		
	}
}
