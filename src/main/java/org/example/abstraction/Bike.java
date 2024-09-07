package org.example.abstraction;

public class Bike extends Vehicle{
    private String bikeType;

    public Bike(String make, String model, int seatingCapacity, String bikeType) {
        super(make, model, seatingCapacity);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Bike Make: " + make + ", Model: " + model + ", Seating Capacity: " + seatingCapacity + ", Bike Type: " + bikeType);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeType='" + bikeType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
