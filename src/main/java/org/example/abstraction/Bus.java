package org.example.abstraction;

public class Bus extends Vehicle{
    private String routeNumber;

    public Bus(String make, String model, int seatingCapacity, String routeNumber) {
        super(make, model, seatingCapacity);
        this.routeNumber = routeNumber;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Bus Make: " + make + ", Model: " + model + ", Seating Capacity: " + seatingCapacity + ", Route Number: " + routeNumber);
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "routeNumber='" + routeNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
