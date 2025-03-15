package com.skilldistillery.animals.entities;

public class Narwhal extends Animal{
	private String noise = "I hope you find your dad!";
	
	
	public Narwhal(String name) {
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
		System.out.println("UGH, my favorite, " + amount + " candy canes! Thanks buddy");
	}
}
