/*
 * Problem Statement:

You are developing a video game that involves different types of characters. 
Each character has unique abilities and attributes. 
You want to implement a mechanism to allow players to select a strategy for their characters, 
which will be used to determine their behavior during gameplay.

Design a class hierarchy for the game characters and a Strategy Design Pattern to 
determine the behavior of the characters based on the selected strategy.

Instructions:

Create a Character class which will be the base class for all the characters in the game. The Character class should have the following properties:
Name
Health Points (HP)
 */
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		
		Character c = new Character();
		
		for (int i=0; i<10; i++) {
			int healthPoints = r.nextInt(100);
			c.setHealthPoints(healthPoints);
			c.meditate();
			c.executeStrategy();
		}
	}

}
