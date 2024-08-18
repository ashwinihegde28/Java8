package org.example.constructor;

import java.util.Date;

public class CarExample {

    String model;
    String color;

    Date year;

    String type;

    public CarExample(String model, String color, Date year, String type) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
    }

    public CarExample() {
    }

    public CarExample(String model) {
        this.model = model;
    }

    public CarExample(String model, String color, Date year) {
        this(); // must be the first statement and calls the default constructor inside the current constructor.
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public CarExample(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static void main(String[] args) {
        CarExample car1 = new CarExample();
        CarExample car2 = new CarExample("model1");
        CarExample car3 = new CarExample("model1","silver");
        CarExample car4 = new CarExample("model1","silver",new Date(2024) );
        CarExample car5 = new CarExample("model1","silver",new Date(2024),"Sedan" );
        System.out.println("Default method "+car1);
        System.out.println("After using Single parameterised constructor " + car2);
        System.out.println("Using double parameterised constructor  " +car3);
        System.out.println("Using triple parameterised constructor  " +car4);
        System.out.println("Using four parameterised constructor  " +car5);


    }

    @Override
    public String toString() {
        return "CarExample{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
