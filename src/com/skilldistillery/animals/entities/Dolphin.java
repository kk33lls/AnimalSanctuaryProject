package com.skilldistillery.animals.entities;

public class Dolphin extends Animal {
	private static String noise = "click click click";
	
	public Dolphin(String name) {
		super(name);
		
	}
	@Override
	public void makeNoise(){
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println();
		makeNoise();
		System.out.println("Yummy, " + amount + " lbs of fish, my favorite!");
	}
}
