package com.company;

public class Porsche extends Car{

    private String gearType;
    private int numberOfExhaust;
    private String color;
    private String productYear;

    public Porsche(String gearType, int numberOfExhaust, String color, String productYear){
        super(1,1,1);
        this.gearType = gearType;
        this.numberOfExhaust = numberOfExhaust;
        this.color = color;
        this.productYear = productYear;
    }
}
