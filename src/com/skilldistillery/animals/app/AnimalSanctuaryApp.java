package com.skilldistillery.animals.app;
import java.util.Scanner;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;
import com.skilldistillery.animals.entities.Dolphin;
import com.skilldistillery.animals.entities.Narwhal;
import com.skilldistillery.animals.entities.Walrus;
public class AnimalSanctuaryApp {
	Sanctuary sanctuary = new Sanctuary();
	
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	
	private void launchApp() {
		sanctuary.setAttendant(new Attendant());
		
		boolean keepGoing = true;
		do {
			printMenu();
			String userOption = kb.next();
			
			if (userOption.equals("a") || userOption.equals("A")) {
				sanctuary.listAnimals();
			}
			
			if (userOption.equals("b") || userOption.equals("B")) {
				
				System.out.println("Please select the animal you'd like to add: ");
				
				String animalAdd = kb.next();
				
				if (animalAdd.equals("dolphin") || animalAdd.equals("Dolphin")) {
					System.out.println("What would you like to name them?");
					String newName = kb.next();
					Animal dolphin = new Dolphin(newName);
					sanctuary.addAnimal(dolphin);
					
				} else if (animalAdd.equals("walrus") || animalAdd.equals("Walrus")) {
					System.out.println("What would you like to name them?");
					String newName = kb.next();
					Animal walrus = new Walrus(newName);
					sanctuary.addAnimal(walrus);
					
				} else if (animalAdd.equals("narwhal") || animalAdd.equals("Narwhal")) {
					System.out.println("What would you like to name them?");
					String newName = kb.next();
					Animal narwhal = new Narwhal(newName);
					sanctuary.addAnimal(narwhal);
					
				} else {
					System.out.println("Invalid input, try again");
				}
			}
			
			if (userOption.equals("c") || userOption.equals("C")) {
					sanctuary.startAttendantRounds();
				}
			
			if (userOption.equals("d") || userOption.equals("D")) {
					System.out.println("Thanks for stopping by!");
					keepGoing = false;
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
