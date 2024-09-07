package org.example.abstraction;

public class SUV extends Car{
    private boolean hasFourWheelDrive;

    public SUV(String make, String model, int seatingCapacity, String transmissionType, boolean hasFourWheelDrive) {
        super(make, model, seatingCapacity, transmissionType);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean isHasFourWheelDrive() {
        return hasFourWheelDrive;
    }

    public void setHasFourWheelDrive(boolean hasFourWheelDrive) {
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "hasFourWheelDrive=" + hasFourWheelDrive +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }

    @Override
    public void specialFeature() {
        System.out.println("This SUV features four-wheel drive.");
    }


    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("This SUV has four wheel drive ? " + ( hasFourWheelDrive? "Yes" : "No"));
    }
}
