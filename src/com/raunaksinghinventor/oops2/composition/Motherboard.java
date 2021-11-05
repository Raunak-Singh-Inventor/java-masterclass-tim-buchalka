package com.raunaksinghinventor.oops2.composition;

public class Motherboard {
	private String model;
	private String manafacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public Motherboard(String model, String manafacturer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manafacturer = manafacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading...");
	}

	public String getModel() {
		return model;
	}

	public String getManafacturer() {
		return manafacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}
}
