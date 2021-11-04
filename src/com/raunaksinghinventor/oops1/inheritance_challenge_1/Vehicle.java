package com.raunaksinghinventor.oops1.inheritance_challenge_1;

public class Vehicle {
    private boolean isEngine;
    private boolean isHandSteering;
    private int seats;
    private int speed;
    private int max_speed;

    public Vehicle(boolean isEngine, boolean isHandSteering, int seats, int max_speed) {
        this.isEngine = isEngine;
        this.isHandSteering = isHandSteering;
        this.seats = seats;
        this.speed = 0;
        this.max_speed = max_speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public void increaseSpeed(int speed) {
        if(this.speed+speed<max_speed && speed > 0) {
            this.speed+=speed;
            System.out.println("increased to speed " + this.speed);
        } else {
            System.out.println("increase of speed failed");
        }
    }

    public void decreaseSpeed(int speed) {
        if(this.speed-speed>=0 && speed > 0) {
            this.speed-=speed;
            System.out.println("decreased to speed " + this.speed);
        } else {
            System.out.println("decrease of speed failed");
        }
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }

    public boolean isHandSteering() {
        return isHandSteering;
    }

    public void setHandSteering(boolean handSteering) {
        isHandSteering = handSteering;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
