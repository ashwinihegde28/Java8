package org.example.abstraction;

public class TrafficOnRoad {
    public static void main(String[] args) {

        Vehicle truck = new Truck("Volvo", "FH16", 2, 12000);
        Vehicle bike = new Bike("Trek", "Domane SL6", 1, "Riser Bars");
        Vehicle bus = new Bus("Iveco", "Daily", 22, "Route 22");
        Car suv = new SUV("Toyota", "Land Cruiser", 7, "Automatic", true);
        Car sedan = new Sedan("Honda", "Accord", 5, "Automatic", true);

        truck.displayVehicleDetails();
        System.out.println("---------------------------------------------------------------\n");
        bike.displayVehicleDetails();
        System.out.println("---------------------------------------------------------------\n");
        bus.displayVehicleDetails();
        System.out.println("---------------------------------------------------------------\n");
        System.out.print("SUV Details ");
        suv.displayVehicleDetails();
        suv.specialFeature();
        System.out.println("---------------------------------------------------------------\n");
        System.out.print("Sedan Details ");
        sedan.displayVehicleDetails();
        sedan.specialFeature();


    }
}
