package org.example.inheritance;

public class MobileBaseClass {

    private String make;

    private String model;
    private double price;

    public MobileBaseClass(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }


    public double getPrice(){
        return price * 1.3;
    }

}
