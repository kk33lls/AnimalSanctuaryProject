package com.skilldistillery.animals.entities;

public class Walrus extends Animal {
	private String noise = "Growls";
	
	public Walrus(String name) {
		super(name);
	}
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println();
		makeNoise();
		System.out.println("I'm chomping down on my " + amount + " clams! So tastyy");
	}
}
