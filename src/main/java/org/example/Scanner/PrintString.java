package org.example.Scanner;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str1 = scanner.next();
        if(!str1.equals(null));
        System.out.println("Welcome " + str1);
    }
}
