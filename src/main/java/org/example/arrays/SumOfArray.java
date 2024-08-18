package org.example.arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int size = scanner.nextInt();
        int dynamicArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the number : ");
            dynamicArray[i] = scanner.nextInt();
        }
        System.out.print("The number array is : ");
        for (int num :
                dynamicArray) {
            System.out.print(num+ " ");
        }

        int [] numbers = {400,200,100,300,800,100};
            System.out.println("\n Sum of given number array is " + calculateSum(dynamicArray));


    }

    public static int calculateSum(int[] numbers){
        if(numbers.length < 0 ){
            System.out.println("Numbers must be present");
            return 0;
        }
        int sum = 0;
        for (int num:
                numbers) {
            sum = sum + num;
        }
        return sum;
    }
}
