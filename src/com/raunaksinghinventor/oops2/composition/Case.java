package com.raunaksinghinventor.oops2.composition;

public class Case {
    private String model;
    private String manafacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manafacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manafacturer = manafacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPwrButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManafacturer() {
        return manafacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
