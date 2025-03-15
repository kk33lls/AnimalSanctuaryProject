package com.skilldistillery.animals.app;
import java.util.Scanner;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;
public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	private void launchApp() {
		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;
		Animal animal = new Animal();//Is this ok?
		Sanctuary sanctuary = new Sanctuary();
		Attendant attendant = new Attendant();

		do {
			printMenu();
			String userOption = kb.next();
			
			if (userOption.equals("a") || userOption.equals("A")) {
				sanctuary.listAnimals();
			}
			
			if (userOption.equals("b") || userOption.equals("B")) {// is there a way to not hard code the sublclasses?
				
				System.out.println("Please select the animal you'd like to add: ");
				
				String animalAdd = kb.next();
				
				if (animalAdd.equals("dolphin")) {
					Animal dolphin = animalAdd;
					sanctuary.addAnimal(dolphin);
				} else if (animalAdd.equals("walrus")) {
					String walrus = animalAdd;
					sanctuary.addAnimal(walrus);
				} else if (animalAdd.equals("narwahl")) {
					sanctuary.addAnimal(narwahl);// ? how
				} else {
					System.out.println("Invalid input, try again");
				}
			
				if (userOption.equals("c") || userOption.equals("C")) {
					attendant.makeRounds(null);// What value should I be passing?
				}
			
				if (userOption.equals("d") || userOption.equals("D")) {
					System.out.println("Thanks for stopping by!");
					keepGoing = false;
				}

			}

		} while (keepGoing);
	}
	private void printMenu() {
		System.out.println("******************************************");
		System.out.println("* Please select an option from the menu: *");
		System.out.println("* a. List current animals                *");
		System.out.println("* b. Add new animal                      *");
		System.out.println("* c. Start attendant's rounds            *");
		System.out.println("* d. Exit program                        *");
		System.out.println("******************************************");
	}

}
