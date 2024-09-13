package org.example.innerClass;

public class annonymousInnerClassDemo {
    public static void main(String[] args) {
        // annonymous class and not the object creation of Abstarct

Laptop dellLaptop = new Laptop() {
    @Override
    void calculate() {
        System.out.println("Calculating .. ");
    }

    @Override
    void surfInternet() {
        System.out.println("Surfing");
    }
}; //here semicolon is a must

        dellLaptop.calculate();
        dellLaptop.surfInternet();
    }
}

abstract class Laptop{
    abstract void calculate();
    abstract void surfInternet();

}

class DellLaptop extends Laptop{

    @Override
    void calculate() {
        System.out.println("Calculating .. ");
    }

    @Override
    void surfInternet() {
        System.out.println("Surfing");
    }
}
