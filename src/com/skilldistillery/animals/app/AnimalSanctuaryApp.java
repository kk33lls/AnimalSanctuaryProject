package com.skilldistillery.animals.app;
import java.util.Scanner;
public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	private void launchApp() {
		Scanner kb = new Scanner(System.in);
		//TODO place everything below in a do while loop
		
		//TODO instantiate a Sanctuary
		Sanctuary sanctuary = new Sanctuary();
		//TODO instantiate a attendant
		Attendant attendant = new Attendant();
		//TODO Add attendant to sanct
		
		//TODO Create a loop? and add animals to Sanct
		
		//TODO Have sanct list animals
		
		//TODO tell sanct to start attendant rounds (last thing)
	}

}
