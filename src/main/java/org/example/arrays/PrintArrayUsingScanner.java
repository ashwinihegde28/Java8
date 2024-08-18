package org.example.arrays;

import java.util.Scanner;

public class PrintArrayUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Array");
        int length = scanner.nextInt();
        int dynamicArray[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("PLease enter the number");
            dynamicArray[i] = scanner.nextInt();
        }
        System.out.println("The number that were entered are ");
        for (int num :
                dynamicArray) {
            System.out.println(num);

        }
        System.out.println("Length of the array : " + dynamicArray.length);

    }
}
