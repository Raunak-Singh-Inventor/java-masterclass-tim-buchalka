package com.raunaksinghinventor.oops_master_challenge;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name,healthyExtra2Name;
    private double healthyExtra1Price,healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        return (super.itemizeHamburger()*100+healthyExtra1Price*100+healthyExtra2Price*100)/100;
    }
}
