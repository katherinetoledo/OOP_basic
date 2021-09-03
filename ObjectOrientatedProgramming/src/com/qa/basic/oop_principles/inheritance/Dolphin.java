package com.qa.basic.oop_principles.inheritance;

public class Dolphin extends Fish{
	
	public boolean eatenFish = true;
	
	//Dolphin class is inheriting the breathesOxygen variable
	//	
	public void changeBreathing() {
		System.out.println(breathesOxygen);
		breathesOxygen = true;
		System.out.println(breathesOxygen);
	}

}
