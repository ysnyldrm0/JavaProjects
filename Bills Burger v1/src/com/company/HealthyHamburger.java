package com.company;

public class HealthyHamburger extends Hamburger{

    private Addition onion;
    private Addition salad;
    private double basePrice;
    private double totalPrice;

    public HealthyHamburger(String breadRoll, String meat, String name, double price) {
        super(breadRoll, meat, name, price);
        onion = new Addition("onion",0.2);
        salad = new Addition("salad",0.3);
        this.setPrice(this.getPrice() + onion.getPrice() + salad.getPrice());
    }

    public Addition getOnion() {
        return onion;
    }

    public Addition getSalad() {
        return salad;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


}
