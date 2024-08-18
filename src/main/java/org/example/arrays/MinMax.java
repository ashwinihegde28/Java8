package org.example.arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int [] numbers = {4,67,89,32,45,899,100};
        maxCalculation(numbers);
        minCalculation(numbers);
    }

    public static void maxCalculation(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The maximum element in the given array is : " + max);
    }

    public static void minCalculation(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("The Minimum element in array is : " + min);
    }
}
