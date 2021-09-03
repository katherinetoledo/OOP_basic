package com.qa.basic.oop_principles.inheritance;

public class Fish {

	
	/*Inheritance: Any classes can acquire ALL non-private properties of another class
	 * This is done through EXTENDIN the oficial class
	 * 
	 */
	
	public boolean breathesOxygen = false;
	
	//Basic method whch returns the noise of the fish
	public String noise() {
		return "Glub Glub";
	}
	
}


// Exercise - Using any type of animal as a class
// Create two variables for that parent class and one method (of something it does)
// Create two types of that class that add a unique variable and method
// Create constructors for those classes
// Create the objects and system out / run the methods from the objects


//Streching goal

//Add a new class that sits inbetween the top parent class and the unique class
//Example:
//Fish > goldfish
//Fish > Tank Fish > Gold Fish
//Fish > Aquatic Mammals > Dolphins

//Add a sub level class, with that class add 2 more unique variables