package com.skilldistillery.animals.app;
import java.util.Scanner;

import com.skilldistillery.animals.entities.Attendant;
public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	private void launchApp() {
		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;
		Sanctuary sanctuary = new Sanctuary();
		Attendant attendant = new Attendant();
		
		do {
		
		//TODO Add attendant to sanct
		
		//TODO Create a loop? and add animals to Sanct
		
		//TODO Have sanct list animals
		
		//TODO tell sanct to start attendant rounds (last thing)
		}while(keepGoing);
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
