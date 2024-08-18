//Speeding ticket
package org.example.Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the speed Limit");
        int speedLimit = scan.nextInt();
        System.out.println("Please enter the current speed");
        int currentSpeed = scan.nextInt();
        generateTicket(speedLimit,currentSpeed);

    }

    public static void generateTicket(int speedLimit, int currentSpeed){
        if(currentSpeed <= speedLimit){
            System.out.println("No Tickets issued");
        } else if ((currentSpeed <= speedLimit + 10) ) {
            System.out.println("Small Tickets issued");
        }else{
            System.out.println("Big Tickets issued");
        }

    }
}
