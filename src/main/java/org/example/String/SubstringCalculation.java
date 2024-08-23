package org.example.String;

import java.util.Scanner;

public class SubstringCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String ");
        String s = scanner.next();
        System.out.println("Please enter the start index");
        int start = scanner.nextInt();
        System.out.println("Please enter the end index");
        int end = scanner.nextInt();
        System.out.println("Substring is " + s.substring(start,end) );
    }
}
