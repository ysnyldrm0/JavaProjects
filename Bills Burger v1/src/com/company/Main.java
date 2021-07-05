package com.company;

public class Main {

    public static void main(String[] args) {


         HealthyHamburger healthyHamburger = new HealthyHamburger("beyaz","tavuk","deluxeHamburger",0.5);
         Addition potato = new Addition("potato",0.5);
        // Hamburger hamburger = new Hamburger("beyaz","tavuk","deluxeHamburger",0.7);
        System.out.println(healthyHamburger.getBasePrice());
        System.out.println(healthyHamburger.hamburgerPrice(potato));
    }
}
