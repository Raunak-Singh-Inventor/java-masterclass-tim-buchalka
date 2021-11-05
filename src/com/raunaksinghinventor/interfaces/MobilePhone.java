package com.raunaksinghinventor.interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean on;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        on = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(on) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
            System.out.println("Phone is switched off");
        } else {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(on) {
            if(phoneNumber == myNumber) {
                isRinging = true;
                System.out.println("Melody ring");
            } else {
                isRinging = false;
            }
        } else {
            System.out.println("Mobile phone is off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
