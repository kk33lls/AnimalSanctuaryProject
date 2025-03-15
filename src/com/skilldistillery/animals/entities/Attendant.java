package com.skilldistillery.animals.entities;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		//Attendant's first output (not needed in loop)
		System.out.println("Oh yes, another day at the aquairium, "
				+ "time to feed my intelligent water friends...");
		//Iterating over the array size to call out each animal with name and quantity
		for (int i = 0; i < animals.length; i++) {
			if (Animal[i] == null) {
					Animal[i] = animals;
			}
			System.out.println("I will feed " + name + " " + eat() + "foods.");
		}
		//Break announcement when loop ends
		System.out.println("Every little animal friend of mine has been fed, time to hibernate.");
	}
}
