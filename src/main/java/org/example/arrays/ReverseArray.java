package org.example.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {78,90,678,9,3,100,45};
        reverseArray(numbers);
    }

    public static void reverseArray(int[] array) {
        System.out.println("Before reversing the array looks like this : ");
        for (int num :
                array) {
            System.out.println(num);
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end  ) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
        System.out.println("After reversing the array looks like this : ");
        for (int num :
                array) {
            System.out.println(num);
        }
    }
}
