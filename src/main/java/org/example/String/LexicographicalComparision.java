package org.example.String;

import java.util.Scanner;

public class LexicographicalComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = scanner.next();
        System.out.println("Enter the second String");
        String s2 = scanner.next();
        String yesNo = (s1.compareTo(s2) > 1) ? "Yes" : "No";
        System.out.println("Is '"+ s1 + "' lexicographically greater than '" + s2 + "' : " + yesNo);
    }
}
