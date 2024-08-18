package org.example.loops.WhileLoop;

import java.util.Scanner;

public class CountUsingScanner {
    public static void main(String[] args) {
        System.out.println("PLease enter the number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        while(no <= 10){
            System.out.println(no);
            no ++;
        }
    }
}
