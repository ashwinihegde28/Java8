package org.example.Scanner;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {
        int repeat = 1;
        do{

        Scanner scanner = new Scanner(System.in);
        System.out.println("For English press 1 and for French press 2");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Please enter your account details");
            String accNo = scanner.next();
            if (isValidAccount(accNo)) {

                System.out.println("Press 1 for Account Balance");
                System.out.println("Press 2 for Card Related query");
                System.out.println("Press 3 To Speak to our customer representative");

                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("You have sufficient Balance");
                        break;
                    case 2:
                        System.out.println("Please enter Card details ");
                        System.out.println("Press 1 for Debit Card");
                        System.out.println("Press 2 for Credit Card");
                        int cardIp = scanner.nextInt();
                        if(cardIp == 1){
                            System.out.println("YOu have balance of $100 in your card");
                        } else if (cardIp == 2) {
                            System.out.println("You have a limit of $1000 in your card");
                        }
                        else {
                            System.out.println("Invalid input");
                        }

                        break;
                    case 3:
                        System.out.println("Please Wait as all our customer representative are busy attending other clients");
                        break;

                    default:
                        System.out.println("Invalid input");

                }
            }


        } else if (choice == 2) {
            System.out.println("Services will start from 2025");

        } else {
            System.out.println("Invalid choice");

        }
            System.out.println("Press '1' to repeat the same or press '0'");
        repeat = scanner.nextInt();
        }while(repeat == 1);

    }

    public static boolean isValidAccount(String accNO) {
        //Need to implement the logic
        return true;
    }
}
