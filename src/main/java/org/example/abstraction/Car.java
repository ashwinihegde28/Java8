package org.example.abstraction;

public abstract class Car extends Vehicle{
    public Car(String make, String model, int seatingCapacity, String transmissionType) {
        super(make, model, seatingCapacity);
        this.transmissionType = transmissionType;
    }

    private String transmissionType;

    public abstract void specialFeature();

    @Override
    public void displayVehicleDetails() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Seating Capacity: " + seatingCapacity + ", Transmission Type: " + transmissionType);
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
