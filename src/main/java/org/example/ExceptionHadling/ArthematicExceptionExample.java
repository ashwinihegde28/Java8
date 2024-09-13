package org.example.ExceptionHadling;

import java.util.Scanner;

public class ArthematicExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();
        double quotient = divideNumbers(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

    }

    public static double divideNumbers(int num1, int num2) {
        double res ;
        try {
            res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
            e.printStackTrace();
            res = Double.NaN;

        }
        return res;
    }
}
