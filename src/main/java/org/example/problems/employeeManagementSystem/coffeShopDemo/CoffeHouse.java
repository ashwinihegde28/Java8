package org.example.problems.employeeManagementSystem.coffeShopDemo;

import java.util.Scanner;

public class CoffeHouse {
    private static final double MUG_PRICE = 10.0;
    private static final double COFFEE_POWDER_PRICE = 15.0;
    private static final double GIFT_CARD_PRICE = 25.0;

    private static final double COFFEE_PRICE = 2.0;
    private static final double BAGEL_PRICE = 3.0;
    private static final double TIMBITS_PRICE = 5.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doneOrder = false;
        double totalAmount = 0;
        int merchendiseChoice= 0;
        int consumableChoice = 0;


        while(!doneOrder){
            System.out.println("Select an option:");
            System.out.println("1. Tims Merchandise");
            System.out.println("2. Tims Consumables");
            System.out.println("3. Done Ordering");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Tims Merchandise");
                    System.out.println("1. Mugs");
                    System.out.println("2. Coffee Powder");
                    System.out.println("3. Gift Card");
                    System.out.print("Your choice: ");
                     merchendiseChoice = scanner.nextInt();
                case 2:
                    System.out.println("Tims Consumable");
                    System.out.println("1. Coffee");
                    System.out.println("2. Donut");
                    System.out.println("3.Bagel");
                    System.out.println("4.Wrap");
                    System.out.println("5.Tim bits");
                    System.out.print("Your choice: ");
                     consumableChoice = scanner.nextInt();
                case 3:
                    System.out.println("Order Completed");
                    System.out.println("**********************");
                    System.out.println("Total Item Ordered");
                    System.out.println("**********************");
                    System.out.println("ITEM: Mug price: $5.0");
                    System.out.println("**********************");
                    System.out.println("Total = " +totalAmount);
                    System.out.println("Proceeding paymnet");
                    System.out.println("### YOU HAVE BALANCE = WALLET ###");
                    System.out.println("Please enter 12 digit card number");
                    //scannner code
                    System.out.println("Please enter 12 digit card number");
                    // scanner code
                    System.out.println("Please enter 3 digit CVV");
                    //Scuccess or failure msg






            }

            switch(merchendiseChoice){

               // System.out.println("Name: ");
                //System.out.println("Name: ");
            }
        }

    }
}
