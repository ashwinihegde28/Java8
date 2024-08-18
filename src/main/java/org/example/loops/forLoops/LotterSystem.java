package org.example.loops.forLoops;

import java.util.Scanner;

public class LotterSystem {
    public static void main(String[] args) {
        System.out.println("You have 3 turns to win a Lottery!");
        System.out.println("Please enter any one number from the console. ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for(int i=1; i<=3 ;i++) {
            System.out.println("Enter your lucky number the number");

            int no = scanner.nextInt();
            if(no % 13 == 0){
                System.out.println("Congratulations! You are the lucky winner");
                break;
            }
            else {
                if(3-i == 0){
                    System.out.println("Sorry exhausted all the turns");
                }
                System.out.println("You can try in another " + (3-i)+ " times");
            }
        }

    }
}
