package org.example.enumeration;

public class EnumExecution {
    public static void main(String[] args) {
        Apple ap = Apple.RedDel;
        System.out.println("Valueod Ap: " + ap);
        if (ap == Apple.HoneyCrisp)
            System.out.println("ap contains HoneyCrisp");
        switch (ap) {
            case Gala:
                System.out.println("Apple gala");
                break;
            case HoneyCrisp:
                System.out.println("Apple Honey Crisp");
                break;
            case Cortland:
                System.out.println("Apple Cortland");
                break;
            case RedDel:
                System.out.println("Apple RedDel is Delicious");
                break;

        }
        Apple[] appleVarieties = Apple.values();
        System.out.println("Varities of apple are ");
        for (Apple apple : appleVarieties
        ) {
            System.out.print(apple);

        }
        System.out.println();

        Apple app1 = Apple.valueOf("Gala");
        System.out.println("Value of Gala is " + app1);

        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Cost of each variety of Apple is ");
        for (Apple apple : Apple.values()
        ) {
            System.out.println(apple + " Costs $" + apple.getPrice() + "/lb");
        }


        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Ordinal values ");
        for (Apple apple : Apple.values()
        ) {
            System.out.println(" Ordinal value of " + apple + " is " + apple.ordinal());
        }
        System.out.println("-----------------------------------");
        System.out.println();

        Apple ap1 = Apple.RedDel;
        Apple ap2 = Apple.Gala;
        Apple ap3 = Apple.Cortland;
        Apple ap4 = Apple.RedDel;
        System.out.println("CompareTo Demo");

        if(ap1.compareTo(ap2) < 0){
            System.out.println(ap + " come before "+ ap2);
        }
        if(ap1.compareTo(ap2) > 0){
            System.out.println(ap2 + " come before "+ ap1);
        }
        if(ap1.compareTo(ap3) == 0){
            System.out.println(ap + " and "+ ap2 +" are equal");
        }
        if(ap1.equals(ap2)){
            System.out.println(
                    "Error"
            );
        }
        if(ap1.equals(ap4)){
            System.out.println(ap1 +
                    " Equals " + ap4
            );
        }
        if(ap1 == ap4){
            System.out.println(ap1 +
                    " Equals " + ap4
            );
        }
    }


}
