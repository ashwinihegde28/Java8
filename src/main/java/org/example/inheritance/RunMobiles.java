package org.example.inheritance;

public class RunMobiles {
    public static void main(String[] args) {
        MobileBaseClass base = new AppleIPhone("Apple","iphone",1600);
        System.out.println("Mobile Phone" + base.getPrice());
    }
}
