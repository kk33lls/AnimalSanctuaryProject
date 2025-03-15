package com.skilldistillery.animals.entities;

import com.skilldistillery.animals.app.Sanctuary;

public class Attendant extends Sanctuary{
	
	public void makeRounds(Animal[] animals) {
		
		//Attendant's first output (not needed in loop)
		System.out.println("Oh yes, another day at the aquairium, "
				+ "time to feed my intelligent water friends...");
		//Iterating over the array size to call out each animal with name and quantity
		for (int i = 0; i < animals.length; i++) {
			int number = (int) (10 * Math.random());
			//Animal not present
			if (animals[i] == null) {
				System.out.println("This enclosure is empty, hmmm, onto the next one");	
			}
			else {//Animal is present FIXME add food hard code or math.random
				System.out.print("I will feed " + animals[i].getName() + " " + number  + " foods.");
				animals[i].eat(number);
			}
		}
		//Break announcement when loop ends
		System.out.println("Every little animal friend of mine has been fed, time to relax.");
	}
}
