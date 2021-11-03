package com.raunaksinghinventor.oops1.carpet_cost_calc;

public class Floor {
	private double width, length;

	public Floor(double width, double length) {
		if (width < 0) {
			width = 0;
		}
		if (length < 0) {
			length = 0;
		}
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		return this.width * this.length;
	}
}
