package com.company;

public class DeluxeHamburger extends Hamburger{

    private Addition chips;
    private Addition drink;
    private double basePrice;

    public DeluxeHamburger(String breadRoll, String meat, String name, double price) {
        super(breadRoll, meat, name, price);
        chips = new Addition("chips",0.1);
        drink = new Addition("cola",0.2);
        basePrice = chips.getPrice() + drink.getPrice() + this.getPrice();
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }

    public double getBasePrice() {
        return basePrice;
    }


}
