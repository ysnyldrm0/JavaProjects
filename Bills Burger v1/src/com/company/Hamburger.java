package com.company;

import java.util.Stack;

public class Hamburger {

    private String breadRoll;
    private String meat;
    private String name;
    private double price;
    private double additionTotal = 0;
    Stack<Addition> additionStack = new Stack<>();

    public Hamburger(String breadRoll, String meat, String name, double price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public Stack<Addition> getAdditionStack() {
        return additionStack;
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

    public void addAddition(Addition addition){
        setAdditionTotal(addition.getPrice());
    }

    public double getAdditionTotal() {
        return additionTotal;
    }

    public void setAdditionTotal(double additionTotal) {
        this.additionTotal += additionTotal;
    }

    public void saveAddition(Addition addition) {
        additionStack.add(addition);
    }
}
