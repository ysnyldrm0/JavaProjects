package com.company;

public class DeluxeHamburger extends Hamburger{

    private Addition chips;
    private Addition drink;


    public DeluxeHamburger(String breadRoll, String meat, String name, double price) {
        super(breadRoll, meat, name, price);
        chips = new Addition("chips",0.1);
        drink = new Addition("cola",0.2);
        this.setPrice(chips.getPrice() + drink.getPrice() + this.getPrice());
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }

}
