package com.qa.basic.oop_principles.abstraction;

public class Runner {
	
	public static void main(String[] args) {
		Jellyfish newJelly = new Jellyfish(7, true);
		
		newJelly.noise();
		newJelly.swim();
	}
	
}