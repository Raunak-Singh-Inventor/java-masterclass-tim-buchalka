package com.raunaksinghinventor.oops1.inheritance_challenge_1;

public class Main {

    public static void main(String[] args) {
        Prius2012 prius = new Prius2012(true,1,true);
        System.out.println(prius.getModel());
        prius.startCar();
        prius.changeToGas();
        prius.changeGear(4);
        System.out.println("max speed: " + prius.getMax_speed());
        prius.increaseSpeed(30);
        prius.changeToBattery();
        prius.increaseSpeed(40);
        prius.changeGear(3);
        prius.changeToGas();
        prius.increaseSpeed(130);
        prius.changeGear(1);
        prius.decreaseSpeed(75);
        prius.decreaseSpeed(70);
        prius.changeToBattery();
        prius.changeGear(-7);
        prius.stopCar();
    }
}
