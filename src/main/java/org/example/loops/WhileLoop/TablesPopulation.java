package org.example.loops.WhileLoop;

import java.util.Scanner;

public class TablesPopulation {
    public static void main(String[] args) {
        System.out.println("PLease enter the number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int n = 1;
        while(n <= 10){
            System.out.println(no+ " * " + n + " = "+ (no * n));
            n++;
        }
    }
}
