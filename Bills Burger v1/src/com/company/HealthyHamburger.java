package com.company;

public class HealthyHamburger extends Hamburger{

    private Addition onion;
    private Addition salad;
    private double basePrice;

    public HealthyHamburger(String breadRoll, String meat, String name, double price) {
        super(breadRoll, meat, name, price);
        onion = new Addition("onion",0.2);
        salad = new Addition("salad",0.3);
        this.basePrice = this.getPrice() + onion.getPrice() + salad.getPrice();
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

    /*public double hamburgerPrice(double price, Addition addition1){
        return price + addition1.getPrice();
    }

    public double hamburgerPrice(double price, Addition addition1, Addition addition2){
        return price + addition1.getPrice() + addition2.getPrice();
    }

    public double hamburgerPrice(double price, Addition addition1 , Addition addition2, Addition addition3){
        return price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice();
    }

    public double hamburgerPrice(double price, Addition addition1, Addition addition2, Addition addition3, Addition addition4){
        return price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
    }

    public double hamburgerPrice(double price, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5){
        return price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice() + addition5.getPrice();
    }

    public double hamburgerPrice(double price, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5, Addition addition6){
        return price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice() + addition5.getPrice() + addition6.getPrice();
    }*/
}
