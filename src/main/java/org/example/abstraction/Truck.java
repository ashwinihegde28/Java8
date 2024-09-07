package org.example.abstraction;

public class Truck extends Vehicle{
    int loadCapacity;


    public Truck(String make, String model, int seatingCapacity, int loadCapacity) {
        super(make, model, seatingCapacity);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Truck Make: " + make + ", Model: " + model + ", Seating Capacity: " + seatingCapacity + ", Load Capacity: " + loadCapacity + " kg");
    }
}
