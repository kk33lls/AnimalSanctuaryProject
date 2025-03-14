package com.skilldistillery.animals.entities;

public class Walrus {
	private String noise = "Growls";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("I'm chomping down on my " + amount + " clams! So tastyy");
	}
}
