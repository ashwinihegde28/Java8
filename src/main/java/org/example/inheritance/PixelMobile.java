package org.example.inheritance;

public class PixelMobile extends MobileBaseClass {

    public PixelMobile(String make, String model, double price) {
        super(make, model, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
