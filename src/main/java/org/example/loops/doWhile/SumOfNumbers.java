package org.example.loops.doWhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");

        int no = scanner.nextInt();
        int sum = 0;
        do {
            sum = sum + no;
            no ++;
        }
        while(no <= 10);
        System.out.println("And the sum is " + sum);
    }
}
