package org.example.loops.doWhile;

import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        System.out.println("PLease enter the number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        do {
            System.out.println(no);
            no ++;
        }
        while(no <= 10);
    }
}
