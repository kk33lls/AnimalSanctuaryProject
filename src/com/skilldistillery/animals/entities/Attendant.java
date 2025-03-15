package com.skilldistillery.animals.entities;

public class Attendant extends Sanctuary{
	
	public void makeRounds(Animal[] animals) {
		//Attendant's first output (not needed in loop)
		System.out.println("Oh yes, another day at the aquairium, "
				+ "time to feed my intelligent water friends...");
		//Iterating over the array size to call out each animal with name and quantity
		for (int i = 0; i < animals.length; i++) {
			//Animal not present
			if (animals[i] == null) {
				System.out.println("This enclosure is empty!");	
			}
			else {//Animal is present FIXME error cannot make a static reference to non-static method
			System.out.print("I will feed " + Attendant.getName() + " " + Attendant.eat(i) + "foods.");
			}
		}
		//Break announcement when loop ends
		System.out.println("Every little animal friend of mine has been fed, time to hibernate.");
	}
}
