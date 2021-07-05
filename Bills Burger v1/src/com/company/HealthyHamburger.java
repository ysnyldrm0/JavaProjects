package com.company;

public class HealthyHamburger extends Hamburger{

    private Addition addition1;
    private Addition addition2;
    private double additionTotal;

    public HealthyHamburger(String meat,Addition addition1, Addition addition2) {
        super("White", meat, "Healthy",2);
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.setPrice(2 + this.addition1.getPrice() + this.addition2.getPrice());
        this.additionTotal = this.addition1.getPrice() + this.addition2.getPrice();
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public double getTotalPrice() {
        return additionTotal + this.getPrice();
    }

    public double getAdditionTotal() {
        return additionTotal;
    }

    public void setAdditionTotal(double additionTotal) {
        this.additionTotal += additionTotal;
    }

    public void addAddition(Addition addition){
        setAdditionTotal(addition.getPrice());
    }
}
