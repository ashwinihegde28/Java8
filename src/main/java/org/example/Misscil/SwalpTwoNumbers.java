package org.example.Misscil;

public class SwalpTwoNumbers {
    public static void main(String[] args) {
        int x = 34;
        int y = 90;
        swapNumbers(34, 90);
    }

    public static void swapNumbers(int x, int y) {
        System.out.println("Before swapping");
        System.out.println("The value of x is  " + x);
        System.out.println("The value of y is  " + y);
        int temp = x;
         x = y;
         y = temp;
        System.out.println("The value of x is  " + x);
        System.out.println("The value of y is  " + y);


    }
}
