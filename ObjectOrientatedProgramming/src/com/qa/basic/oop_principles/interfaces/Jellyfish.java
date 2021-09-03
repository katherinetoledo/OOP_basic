package com.qa.basic.oop_principles.interfaces;


// The BEST PRACTICE IS TO ADD THE INTERFACES LIKE HERE
public class Jellyfish implements Swim, Sleep, Sting, Eat, Breath, Habitat{

	private String name;
	
	@Override
	public void sting() {
		System.out.println("Owwwwwwww");
		
	}

	@Override
	public void sleep() {
		System.out.println("Not sure if it sleeps or not...");
		
	}

	@Override
	public void swim() {
		System.out.println("Floats across the Sea");
		
	}

	//CONSTRUCTOR
	public Jellyfish(String name) {
		super();
		this.name = name;
	}

	@Override
	public void habitat() {
		System.out.println("All oceans waters");
		
	}

	@Override
	public void breath() {
		System.out.println("No structures dedicated for respiration or circulation");
		
	}

	@Override
	public void eat() {
		System.out.println("Small plants, fish eggs");
		
	}
	
	
	//generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
