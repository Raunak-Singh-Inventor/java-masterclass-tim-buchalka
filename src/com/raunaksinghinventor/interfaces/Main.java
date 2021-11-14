package com.raunaksinghinventor.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone raunaksPhone = new DeskPhone(123456);
        raunaksPhone.powerOn();
        raunaksPhone.callPhone(123456);
        raunaksPhone.answer();
    }
}
