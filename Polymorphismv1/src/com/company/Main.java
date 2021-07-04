package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(8,"Electric");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(8,"Kuga");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(4,"Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());



    }
}

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }
    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }

}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Holden -> startEngine";
    }

    @Override
    public String accelerate(){
        return "Holden -> accelerate()";
    }
    @Override
    public String brake(){
        return "Holden -> brake()";
    }

}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }
    @Override
    public String brake(){
        return "Ford -> brake()";
    }

}
