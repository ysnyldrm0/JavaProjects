package com.company;

public class Main {

    public static void main(String[] args) {
        Porsche carreraGt = new Porsche("Automatic",2,"red","2020");

        carreraGt.accelerate();
        carreraGt.gears(1);
        carreraGt.accelerate();
        carreraGt.gears(2);
        carreraGt.steering("left");
        carreraGt.slowdown();
        carreraGt.gears(1);
        carreraGt.steering("right");
    }
}
