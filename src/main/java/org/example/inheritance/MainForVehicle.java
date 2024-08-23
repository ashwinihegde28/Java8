package org.example.inheritance;

import java.util.Date;

public class MainForVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.model = " Model";
        vehicle.make = " Make";
        vehicle.color = " Color";
        vehicle.year = new Date();
        vehicle.printDetails();
        System.out.println("*****************************************");

        Car car = new Car();
        car.model = "Sentra";
        car.make = "Nissan";
        car.color = "Blue";
        car.year = new Date();
        car.bodyType = "Sedan";
        System.out.println("Car Details:");
        car.printDetails();
        car.printCarDetails();
        System.out.println(car.toString());
        System.out.println();
        System.out.println("*****************************************");

        Truck truck = new Truck();
        truck.model = "Truck Model";
        truck.make = "Truck make";
        truck.color = "Red";
        truck.year = new Date();
        truck.loadCapacity = "100 tons";
        System.out.println("Truck Details:");
        truck.printDetails();
        truck.printTruckDetails();
        System.out.println(truck.toString());
        System.out.println();
        System.out.println("*****************************************");

        Bike bike = new Bike();
        bike.model = "Bike Model 1";
        bike.make = "Bike Make";
        bike.color = "Green";
        bike.year = new Date();
        bike.passengerCapacity = "2";

        System.out.println("Bike Details:");
        bike.printDetails();
        bike.printBikeDetails();
        System.out.println(bike.toString());
    }
}
