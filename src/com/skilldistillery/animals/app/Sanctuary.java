package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant;

	public void listAnimals() {
		for(int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("Enclosure " + ( i + 1 ) + " is empty");
			}
			else {
				System.out.println(animals[i].getName() + " the " + ( animals[i].getClass() ).getSimpleName());
			}
		}
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println(animals[i].getName() + " has been added to the aquarium!");
				return;
			}
		}
		System.out.println("My apologies we cannot add your new friend, the aquarium is full!");
	}
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
}
