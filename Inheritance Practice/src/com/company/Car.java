package com.company;

public class Car extends Vehicle{

    private int signals;
    private int wheels;
    private int mirrors;

    public Car(int signals, int wheels, int mirrors) {
        super(1, 1, 1);
        this.signals = signals;
        this.wheels = wheels;
        this.mirrors = mirrors;
    }

    public void gears(int gear){
        switch (gear){
            case 1:
                System.out.println("Gear to 1");
                break;
            case 2:
                System.out.println("Gear to 2");
                break;
            case 3:
                System.out.println("Gear to 3");
                break;
            case 4:
                System.out.println("Gear to 4");
                break;
            case 5:
                System.out.println("Gear to 5");
                break;
            case 6:
                System.out.println("Gear to 6");
                break;
        }
    }

    public void steering(String steerDirection){
        switch (steerDirection){
            case "left":
                System.out.println("Steering to left");
                break;
            case "right":
                System.out.println("Steering to right");
                break;
        }
    }

    public void accelerate(){
        System.out.println("Speed is increasing");
    }

    public void slowdown(){
        System.out.println("Speed is decreasing");
    }

}
