package org.example.abstraction;

public  abstract class Vehicle {

    protected String make;
    protected String model;
    protected int seatingCapacity;

    public Vehicle(String make, String model, int seatingCapacity) {
        this.make = make;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    public abstract int getSeatingCapacity();
    public abstract void displayVehicleDetails();

}
