package org.example.inheritance;

public class AppleIPhone extends MobileBaseClass {


    public AppleIPhone(String make, String model, double price) {
        super(make, model, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+200;
    }
}
