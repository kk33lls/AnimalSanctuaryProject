package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {
	private Animal[] animals;
	private Attendant attendant;

	public void setAttendant(Attendant attendant) {
		
	}
	public void listAnimals() {
		for(int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("This enclosure is empty.");
			}
			else {
				System.out.println(animals);
			}
		}
	}
	public void addAnimal(Animal animal) {
		animals = new Animal[5];
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return;
			}
			if(animals.length == 5) {
				System.out.println("Sorry, the aquarium is full!");
			}
		}
	}
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
}
