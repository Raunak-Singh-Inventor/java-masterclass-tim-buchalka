package com.raunaksinghinventor.oops1.inheritance_challenge_1;

public class Prius2012 extends Car {
    private String model;
    private boolean isHybrid;
    private int batteries;
    private boolean isAWD;


    public Prius2012(boolean isHybrid, int batteries, boolean isAWD) {
        super(4, 130);
        this.model = "Prius 2012";
        this.isHybrid = isHybrid;
        this.batteries = batteries;
        this.isAWD = isAWD;
    }

    public String getModel() {
        return model;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public int getBatteries() {
        return batteries;
    }

    public boolean isAWD() {
        return isAWD;
    }

    public void changeToBattery() {
        System.out.println("changed to battery power");
    }

    public void changeToGas() {
        System.out.println("changed to gas power");
    }
}
