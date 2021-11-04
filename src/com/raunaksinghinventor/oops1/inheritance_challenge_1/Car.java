package com.raunaksinghinventor.oops1.inheritance_challenge_1;

public class Car extends Vehicle {
    private int gear;

    public Car(int seats, int max_speed) {
        super(true, true, seats, max_speed);
        this.gear = 0;
    }

    public void changeGear(int number) {
        if(gear+number<=8 && gear+number>=0) {
            this.gear+=number;
            System.out.println("changed to gear " + this.gear);
        } else {
            System.out.println("cannot change gear");
        }
    }

    public void startCar() {
        System.out.println("starting car");
    }

    public void stopCar() {
        System.out.println("car stopped");
    }
}
