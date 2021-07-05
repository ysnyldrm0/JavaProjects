package com.company;


public class Hamburger {

    private String breadRoll;
    private String meat;
    private String name;
    private double price;

    public Hamburger(String breadRoll, String meat, String name, double price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }
    
    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double hamburgerPrice(Addition addition1){
       return this.price + addition1.getPrice();

    }

    public double hamburgerPrice(Addition addition1, Addition addition2){
        return this.price + addition1.getPrice() + addition2.getPrice();

    }

    public double hamburgerPrice(Addition addition1 , Addition addition2, Addition addition3){
        return this.price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice();

    }

    public double hamburgerPrice(Addition addition1, Addition addition2, Addition addition3, Addition addition4){
        return this.price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
    }

}
