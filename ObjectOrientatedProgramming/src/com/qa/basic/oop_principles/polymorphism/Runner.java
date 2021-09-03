package com.qa.basic.oop_principles.polymorphism;

public class Runner {

	// Polymorphism - Poly: many off / Morphism: Objects = Objects belong to other objects in the chain
	// NOT the dea thar EVERYTHING is an object
	// The idea that all OBJECTS in java are objects of something else of something else... etc..
	
	// goldy is a Goldfish
	// goldy is a Fish
	// goldy is an Object
	
	// All objects created within Java are PolyMorphic because they are at least 2 objects
	
	public static void main(String[] args) {
		
		//Goldy is a goldfish
		Goldfish goldy = new Goldfish("Golden", 3);
		goldy.noise();
		
		// Goldy2 is a Fish
		Fish goldy2 - new Goldfish("Sunset Orange", 2);
		((Goldfish) goldy2).noise();
		
		
		//is goldy3 an object? 
		//yes, goldy 3 is an Object
		Object goldy3 = new Goldfish("Maroon", 4);
		((Goldfish)goldy3).noise();
		
		// The Goldfish class / object IS polymorphic because it can take on many different objects
		
	}
	
}
