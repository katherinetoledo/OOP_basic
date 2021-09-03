package com.qa.basic.oop_principles.inheritance;


/* The gold fish class will inherit the class numbers of the fish class
 * Have access to those variables and methods AND its own
 */

//Extends keyword followed by the class to extend from

public class GoldFish extends Fish {
	
	//The variable Colour is not related to the ORIGINAL fish class
	public String colour = "golden";
	
	//This method will print out the GoldFish traits AND the fish traits
	public void fishTraits() {
		System.out.println("Fish colour : " + colour);
		System.out.println("Breathes oxygen : " + breathesOxygen);
		System.out.println("Breathes oxygen : " + super.breathesOxygen);
		System.out.println(noise());
		
	}

	//Making a constructor for the gold fish class
	
}
