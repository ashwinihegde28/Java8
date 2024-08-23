package org.example.inheritance;

import java.util.Date;

public class Truck extends Vehicle{
     String loadCapacity;

     public Truck(){
         super();
         System.out.println("Inside Truck constructor");
     }

    public Truck(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(int fuelCapacity, String loadCapacity) {
        super(fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String model, String make, String color, Date year, int fuelCapacity, String loadCapacity) {
        super(model, make, color, year, fuelCapacity);
        this.loadCapacity = loadCapacity;
    }

    public void printTruckDetails(){
        System.out.println("Method from truck");
        //printTruckDetails();
        System.out.println("Load Capacity is " + loadCapacity);
    }
}
