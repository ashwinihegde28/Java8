package org.example.loops.doWhile;

import java.util.Scanner;

public class PopulateTables {
    public static void main(String[] args) {
        System.out.println("PLease enter the number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int n = 1;
        do{
            System.out.println(no+ " * " + n + " = "+ (no * n));
            n++;
        }
        while(n <= 10);
    }
}
