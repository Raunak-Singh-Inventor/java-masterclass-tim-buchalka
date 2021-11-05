package com.raunaksinghinventor.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone raunaksPhone = new DeskPhone(123456);
        raunaksPhone.powerOn();
        raunaksPhone.callPhone(123456);
        raunaksPhone.answer();

        raunaksPhone = new MobilePhone(24565);
        raunaksPhone.powerOn();
        raunaksPhone.callPhone(24565);
        raunaksPhone.answer();
    }
}
