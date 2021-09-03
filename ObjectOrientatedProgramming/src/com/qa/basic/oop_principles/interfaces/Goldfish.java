package com.qa.basic.oop_principles.interfaces;

// Primary class starting with is the more specific type of fish

// Interfaces: a completely abstract class only containing methods with empty bodies
//No need to specify the empty methods as abstract, they are all abstract by default

// Previously to use the abstract class, needed to use EXTEND
//Drawback with abstract classes is you can only EXTEND one class

// With interfaces, use IMPLEMENTS keyword instead
// WIth interfaces, multiple interfaces can be implemented at the same time


//NOT THE BEST PRACTICE, SHOULD BE: implements Swim, Habitat.....
public class Goldfish implements Fish {

	private String name;
	
	@Override
	public void sleep() {
		System.out.println("Sleeping!");
		
	}

	@Override
	public void noise() {
		System.out.println("Glub glub glub");
		
	}

	@Override
	public void swim() {
		System.out.println("Swimming across the Sea...");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat Algae");
		
	}

	@Override
	public void breath() {
		System.out.println("Oxygen");
		
	}

	@Override
	public void habitat() {
		System.out.println("Cool streams, lakes, and ponds throughout Asia and parts of Eastern Europe");
		
	}
	
	//make a constructor for this
	// source > generate constructor using fields
	// but it needs a variable to do a constructor
	// in this case: private String name;
	
	public Goldfish(String name) {
		super();
		this.name = name;
	}

	
	//use get and set
	//source >> generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

	
	