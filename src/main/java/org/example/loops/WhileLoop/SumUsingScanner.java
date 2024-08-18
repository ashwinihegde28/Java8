package org.example.loops.WhileLoop;

import java.util.Scanner;

public class SumUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the number");

        int no = scanner.nextInt();
        int sum = 0;
        while(no <= 10){
            sum = sum + no;
            no ++;
        }
        System.out.println("And the sum is " + sum);
    }
}
