package com.qa.basic.oop_principles.encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Fish goldFish = new Fish("Gold", "small fish", 4, 5, 3, false);
		System.out.println(goldFish.getColour());
		
		//Set the colour of the goldfish to be maroon
		goldFish.setColour("Maroon");
		System.out.println(goldFish.getColour());
		
		//If I wanted to specify colour CANNOT be blue, can be done with setter
		goldFish.setColour("Blue");
		System.out.println(goldFish.getColour());
		
		goldFish.setSize(-3);
	}

}
