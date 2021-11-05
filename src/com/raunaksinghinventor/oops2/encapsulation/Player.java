package com.raunaksinghinventor.oops2.encapsulation;

// BAD EXAMPLE without Encapsulation

public class Player {
	public String fullName; // change of variable from name to fullName should only affect this class ( if
							// getters were used )
							// but, it is affecting the main class too, as it is accessing variable directly
	public int health;
	public String weapon;

	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");
			// Reduce num of lives remaining for the player
		}
	}

	public int healthRemaining() {
		return this.health;
	}
}
