package org.example.inheritance;

import java.util.Date;

public class Car extends Vehicle{
     String bodyType;

    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(int fuelCapacity, String bodyType) {
        super(fuelCapacity);
        this.bodyType = bodyType;
    }

    public Car(String model, String make, String color, Date year, int fuelCapacity, String bodyType) {
        super(model, make, color, year, fuelCapacity);
        this.bodyType = bodyType;
    }


    public Car() {
       super();
        System.out.println("Inside Car constructor");
    }

    public void printCarDetails(){
        System.out.println("Method from Car");
        //printDetails();
        System.out.println("Body type : " + bodyType);
    }
}
