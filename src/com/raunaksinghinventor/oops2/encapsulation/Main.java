package com.raunaksinghinventor.oops2.encapsulation;

public class Main {
	public static void main(String[] args) {
//		// BAD EXAMPLE without Encapsulation
//		Player player = new Player();
//		player.name = "Tim";
//		// player.health = 20; // might forget to initalize variables
//		player.weapon = "Sword";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//		player.health = 200; // taking functionality out of Player class
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		// GOOD EXAMPLE with Encapsulation
		EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Battle Ax");
		System.out.println("Inital health is " + player.getHealth());

	}
}
