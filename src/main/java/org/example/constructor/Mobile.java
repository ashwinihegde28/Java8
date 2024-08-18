package org.example.constructor;

public class Mobile {
    String model;
    int memory;
    String color = "Red";

    public Mobile(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }

    public Mobile(String model, int memory) {
        this.model = model;
        this.memory = memory;
        this.color = "Green";
    }

    public void display() {
        System.out.println("Model  : " + model);
        System.out.println("Memory :  " + memory);
        System.out.println("Color  : " + this.color);
    }

    public Mobile(String model) {
        this.model = model;
        this.memory = 256;
        this.color = "Blue";
    }

    }
