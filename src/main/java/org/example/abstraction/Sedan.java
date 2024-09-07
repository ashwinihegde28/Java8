package org.example.abstraction;

public class Sedan extends Car{
    private boolean hasSunroof;

    public Sedan(String make, String model, int seatingCapacity, String transmissionType, boolean hasSunroof) {
        super(make, model, seatingCapacity, transmissionType);
        this.hasSunroof = hasSunroof;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    @Override
    public void specialFeature() {
        System.out.println("This Sedan has sun roof features.");
    }

    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("This Sedan has sunroof ? " + (hasSunroof ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "hasSunroof=" + hasSunroof +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
