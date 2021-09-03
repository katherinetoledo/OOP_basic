package com.qa.basic.oop_principles.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		Goldfish goldy = new Goldfish("Goldy");
		Jellyfish steven = new Jellyfish("Steven");
		
		goldy.noise();
		steven.swim();
		goldy.sleep();
		steven.sleep();

		// Exercise
		// Using an existing / new animal class
		// Create at least 3 interfaces using existing methods (sleep, swim, eat..)
		// Implement those interfaces on at least 2 different animal classes
		
		goldy.eat();
		steven.eat();
		goldy.habitat();
		steven.habitat();
		goldy.breath();
		steven.breath();
	}

}
