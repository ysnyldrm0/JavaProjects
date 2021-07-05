package com.company;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Addition[] addition = new Addition[10];
        addition[0] = new Addition("onion",0.15);
        addition[1] = new Addition("salad",0.4);
        addition[2] = new Addition("ketchup",0.1);
        addition[3] = new Addition("moyanaisse",0.1);
        addition[4] = new Addition("tomato",0.15);
        addition[5] = new Addition("potato",0.15);
        addition[6] = new Addition("cola",0.2);
        addition[7] = new Addition("chips",0.3);
        addition[8] = new Addition("nuggets",0.5);
        addition[9] = new Addition("ranch",0.1);

        Hamburger hamburger = new Hamburger("White Roll","Chicken","Hamburger",1.5);
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Beef");
        HealthyHamburger healthyHamburger = new HealthyHamburger("Chicken",addition[0],addition[1]);


        Scanner scanner = new Scanner(System.in);
        int input;
        int additionalInput;
        int counter = 0;

        do {
            counter = 0;
            System.out.println(" <-> <-> <-> Welcome to Bills Burger <-> <-> <-> ");
            System.out.println(" - - - - - - - - - Burger Menu - - - - - - - - - ");
            System.out.println("1 - " + hamburger.getName() + " - " + hamburger.getPrice() + "$");
            System.out.println("2 - " + deluxeHamburger.getName() + " - " + deluxeHamburger.getPrice() + "$");
            System.out.println("3 - " + healthyHamburger.getName() + " - " + healthyHamburger.getPrice() + "$");
            System.out.println("0 - Cancel Order");
            System.out.println("Please type your choice: ");
            input = Integer.parseInt(scanner.nextLine());

            switch (input){

                case 1:
                    System.out.println("For " + hamburger.getName() + " you can add 4 additional brand");
                    while(counter < 4){
                        System.out.println((counter+1) + ". addition: ");
                        additionSelector(addition);
                        System.out.println("Please type your choice: ");
                        additionalInput = Integer.parseInt(scanner.nextLine());
                        if(additionalInput == 0)
                            counter++;
                        else {
                            hamburger.addAddition(addition[additionalInput - 1]);
                            hamburger.saveAddition(addition[additionalInput - 1]);
                            counter++;
                        }
                    }
                    orderDetails(hamburger);
                    break;
                case 2:
                    System.out.println("For " + deluxeHamburger.getName() );
                    orderDetails(deluxeHamburger);
                    break;
                case 3:
                    healthyHamburger.saveAddition(healthyHamburger.getAddition1());
                    healthyHamburger.saveAddition(healthyHamburger.getAddition2());
                    System.out.println(healthyHamburger.getName() + " has 2 addition as a default " + healthyHamburger.getAddition1().getName() + " - " + healthyHamburger.getAddition1().getPrice() + "$"
                            + " & " + healthyHamburger.getAddition2().getName() + " - " + healthyHamburger.getAddition1().getPrice() + "$" + " but if you want you can add 4 additional brand as an extra");
                    while(counter < 4){
                        System.out.println((counter+1) + ". addition: ");
                        additionSelector(addition);
                        System.out.println("Please type your choice: ");
                        additionalInput = Integer.parseInt(scanner.nextLine());
                        if(additionalInput == 0)
                            counter++;
                        else {
                            healthyHamburger.addAddition(addition[additionalInput - 1]);
                            healthyHamburger.saveAddition(addition[additionalInput - 1]);
                            counter++;
                        }
                    }
                    orderDetails(healthyHamburger);
                    break;
            }
        }while(input != 0);

    }

    private static void orderDetails(Hamburger hamburger) {

        System.out.println(" -*-*- Order Details -*-*- ");
        System.out.println("Menu selected: " + hamburger.getName() + ", " + hamburger.getBreadRoll() + ", " + hamburger.getMeat() + " - " + hamburger.getPrice() + "$");
        System.out.print("Additions selected: ");
        while(!hamburger.getAdditionStack().isEmpty()){
            System.out.print(hamburger.getAdditionStack().peek().getName() + " - " + hamburger.getAdditionStack().peek().getPrice() + "$ ");
            System.out.print(", ");
            hamburger.getAdditionStack().pop();
        }
        System.out.println();
        System.out.println("Additions total prices: " + String.format("%.2f", hamburger.getAdditionTotal()) + "$");
        System.out.println("Menu's total price: " + String.format("%.2f", (hamburger.getAdditionTotal() + hamburger.getPrice())) + "$");
        System.out.println();
    }

    private static void orderDetails(DeluxeHamburger deluxeHamburger) {

        System.out.println(" -*-*- Order Details -*-*- ");
        System.out.println("Menu selected: " + deluxeHamburger.getName() + ", " + deluxeHamburger.getBreadRoll() + ", " + deluxeHamburger.getMeat() + " - " + deluxeHamburger.getPrice() + "$");
        System.out.print("Additions selected: " + deluxeHamburger.getDrink().getName() + " - " + deluxeHamburger.getDrink().getPrice() + "$, "
                                                + deluxeHamburger.getChips().getName() + " - " + deluxeHamburger.getChips().getPrice() + "$");
        System.out.println();
        System.out.println("Additions total prices: " + String.format("%.2f", deluxeHamburger.getAdditionTotal()) + "$");
        System.out.println("Menu's total price: " + String.format("%.2f", (deluxeHamburger.getAdditionTotal() + deluxeHamburger.getPrice())) + "$");
        System.out.println();
    }

    private static void orderDetails(HealthyHamburger healthyHamburger) {

        System.out.println(" -*-*- Order Details -*-*- ");
        System.out.println("Menu selected: " + healthyHamburger.getName() + ", " + healthyHamburger.getBreadRoll() + ", " + healthyHamburger.getMeat() + " - " + healthyHamburger.getPrice() + "$");
        System.out.print("Additions selected: ");
        while(!healthyHamburger.getAdditionStack().isEmpty()){
            System.out.print(healthyHamburger.getAdditionStack().peek().getName() + " - " + healthyHamburger.getAdditionStack().peek().getPrice() + "$ ");
            System.out.print(", ");
            healthyHamburger.getAdditionStack().pop();
        }
        System.out.println();
        System.out.println("Additions total prices: " + String.format("%.2f", healthyHamburger.getAdditionTotal()) + "$");
        System.out.println("Menu's total price: " + String.format("%.2f", (healthyHamburger.getAdditionTotal() + healthyHamburger.getPrice())) + "$");
        System.out.println();


    }


    private static void additionSelector(Addition[] addition) {
        for(int i = 0 ; i < 10 ; i++){
            System.out.println((i+1) + " - " + addition[i].getName() + " - " + addition[i].getPrice() + "$");
        }
        System.out.println("0 - Skip brand");
    }

}
