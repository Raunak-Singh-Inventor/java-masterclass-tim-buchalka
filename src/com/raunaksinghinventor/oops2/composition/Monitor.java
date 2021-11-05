package com.raunaksinghinventor.oops2.composition;

public class Monitor {
    private String model;
    private String manafacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manafacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manafacturer = manafacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManafacturer() {
        return manafacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
