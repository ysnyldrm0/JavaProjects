package com.company;

public class DeluxeHamburger extends Hamburger{

    private Addition chips;
    private Addition drink;
    private double additionTotal;


    public DeluxeHamburger(String meat) {
        super("Brown Rye", meat, "Deluxe", 3.0);
        chips = new Addition("chips",0.3);
        drink = new Addition("cola",0.2);
        additionStack.push(drink);
        additionStack.push(chips);
        this.setPrice(this.getPrice() + chips.getPrice() + drink.getPrice());
        this.setAdditionTotal(chips.getPrice() + drink.getPrice());
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }

    public double getAdditionTotal() {
        return additionTotal;
    }

    public void setAdditionTotal(double additionTotal) {
        this.additionTotal = additionTotal;
    }

    public double getTotalPrice() {
        return additionTotal + this.getPrice();
    }
}
