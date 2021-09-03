package com.qa.fishtank;

//Role of this class is to run the application
//Create some fish, add the fish to the tank

//Ctrl Space brings up all possible code?? 

public class Runner {
	
	public static void main(String[] args) {
		
		// First thing to do within my runner is create a new FishTank object
		//I need first a fistTank methods in order to create my objects
		//fishTank is my object
		// it's going to get away of static methods as much as possible (?)
		FishTank fishTank = new FishTank();
		
		// Fish objects
		// Make a new fish called fish1 
		Goldfish fish1 = new Goldfish("Hazy Orange", "Percy", 3, false);
		Goldfish fish2 = new Goldfish("Dull Gold", "Kelly", 4, false);
		Goldfish fish3 = new Goldfish("Maroon", "Maroon 5", 4, false);
		
		//Extra
//		String newString = "hey";
//		
//		System.out.println(fish1.getColour());
//		fish1.setColour("Brown");
//		System.out.println(fish1.getColour());
		
		// Add fish1 to the tank
		fishTank.addToTank(fish1);
		fishTank.addToTank(fish2);
		fishTank.addToTank(fish3);
		
		// Create a method to output all of the names of all of the fish
		// Accessing the fishtank array within the fish tank object
			//Because if use (DO NOT USE)!
			System.out.println(fishTank.fishTank);
			// It will not work really well because fishTank is the name of the array
			// You get weird results because the outputs are objects rather than strings (or etc)
		
			//Best solution --> enhanced follow (go to FishTank) listNames
			fishTank.listName();
		
			//EXTRA
//		// Change the name of fish 1 to "Greg"
//		System.out.println(fish1.getName());
//		fish1.setName("Greg");
//		System.out.println(fish1.getName());
//		fish1.getColour(); 
//		System.out.println(fish1.getColour());
//		
		
		
		
		//=====================================//
		
		// Exercise
		// Animal Habitat exercise
		// Create a new animal class (for a specific type of animal) with at least 4 variables and 1 method
		// Include getters, setters and constructor
		// Create an appropriate habitat class for that animal
		// Habitat class must include the following methods:
		// - Add to habitat
		// - Remove all animals from habitat
		// - Get one variable from all animals (animal.getName())
		// - Run Method of one animal by specifying one of the variables
		// - Remove an animal from the habitat by specifying one of the variables
		
	}
	
}
