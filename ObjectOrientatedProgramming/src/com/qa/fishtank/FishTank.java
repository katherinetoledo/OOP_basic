package com.qa.fishtank;

import java.util.ArrayList;

// Role of this class is to create an arraylist for the objects
// Include all of the methods for managing and viewing our objects

public class FishTank {

	// Make an array list of the object GoldFish
	
	ArrayList<Goldfish> fishTank = new ArrayList<>();

	// Method to add Goldfish to out fishtank
	// Take in a GoldFish (fish) and use the arraylist method to add this object to the list
	
	public void addToTank(Goldfish fish) {
		//Goldfish = datatype & fish = name of the variable that you are using (the object)
		//similar of what we have in our runner goldfish = new fish
		
		fishTank.add(fish); // the object that has been added
		System.out.println(fish.getName() + " has been added to the Recovery tank");
	}
	
	//Create a method to output all of the names of all of the fish
	//Creating an enhanced for loop / for each loop for the array
	// For each Goldfish in the array output the name
	public void listName() {
		for(Goldfish fish : fishTank) {
			System.out.println(fish.getName() + " has been added to the Recovery tank.");
		}
	}
	
	// I want to run the makeNoise method of a goldFish with a set name
	//Specify an object by one if its variables (name, id, colour,...)
	public void fishMakeNoise(String name) {
		
	}
	
	
}
