package com.skilldistillery.animals.entities;

public class Narwhal extends Animal{
	private String noise = "Bye buddy! I hope you find your dad!";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("UGH, my favorite, " + amount + " candy canes! Thanks buddy");
	}
}
