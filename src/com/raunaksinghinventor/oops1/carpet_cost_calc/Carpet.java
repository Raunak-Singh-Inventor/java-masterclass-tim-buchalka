package com.raunaksinghinventor.oops1.carpet_cost_calc;

public class Carpet {
	private double cost;

	public Carpet(double cost) {
		if (cost < 0) {
			cost = 0;
		}
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
