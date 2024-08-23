package org.example.inheritance;

import java.util.Date;

public class Vehicle {

    String model;
    String make;
    String color;

    Date year;
    int fuelCapacity;

    public Vehicle() {
        System.out.println("Vehicle constructor");
    }

    public Vehicle(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Vehicle(String model, String make, String color, Date year, int fuelCapacity) {
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
    }


    public void printDetails(){
        System.out.println("Method from Vehicle is called");
        System.out.println("Model : " + model);
        System.out.println("Make : " + make);
        System.out.println("color : " + color);
        System.out.println("year : " + year);
        System.out.println("Fuel Capacity :" + fuelCapacity);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
