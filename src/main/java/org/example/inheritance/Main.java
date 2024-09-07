package org.example.inheritance;


class
Animal {
    void sound() {
        System.out.println(
                "Animal makes a sound"
        );
    }
}

class
Dog extends Animal {
    @Override
    void sound() {
        System.out.println(
                "Dog barks"
        );
    }

    void makeSound() {
        super.sound();
// Calls the superclass (Animal) method
        sound();
// Calls the overridden method in Dog
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
// Output: Animal makes a sound// Dog barks
    }
}