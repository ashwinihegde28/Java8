package org.example.inheritance;

import java.util.Date;

public class Bike extends Vehicle{
    String passengerCapacity;

    public Bike() {
        super();
        System.out.println("Inside Bike's Constructor ");
    }



    public Bike(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Bike(int fuelCapacity, String passengerCapacity) {
        super(fuelCapacity);
        this.passengerCapacity = passengerCapacity;
    }

    public Bike(String model, String make, String color, Date year, int fuelCapacity, String passengerCapacity) {
        super(model, make, color, year, fuelCapacity);
        this.passengerCapacity = passengerCapacity;
    }


    public void printBikeDetails(){
        System.out.println("Method from Bike");
        //printDetails();
        System.out.println("Passenger capacity is " + passengerCapacity);
    }
}
