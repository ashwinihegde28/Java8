package org.example.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to check if its palindrome ");
        String str = scanner.nextLine();
        if (str == null) {
            System.out.println("Invalid input");
        } else {
            System.out.print("The string entered  " + str);
            if (palindrome(str.toLowerCase())) {
                System.out.println(" is a Palindrome");

            } else {
                System.out.println( " is not a  Palindrome");
            }
        }


    }

    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++ ;
            right -- ;
        }
        return true;
    }
}
