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

    /*private void hamburgerPrice(Addition addition1){
        totalPrice = this.price + addition1.getPrice();
    }

    private void hamburgerPrice(Addition addition1, Addition addition2){
        totalPrice =  this.price + addition1.getPrice() + addition2.getPrice();
    }

    private void hamburgerPrice(Addition addition1 , Addition addition2, Addition addition3){
        totalPrice =  this.price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice();
    }

    private void hamburgerPrice(Addition addition1, Addition addition2, Addition addition3, Addition addition4){
        totalPrice =  this.price + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
    }*/

}
