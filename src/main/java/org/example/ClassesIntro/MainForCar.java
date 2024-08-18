package org.example.ClassesIntro;

public class MainForCar {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("car Speed mentioned : " + car.speed);
        System.out.println("car brand is : " + car.brand);
        System.out.println("car Colour is : " + car.color);
        car.start();
        car.run();
        car.brake();
        car.stop();

    }
}
