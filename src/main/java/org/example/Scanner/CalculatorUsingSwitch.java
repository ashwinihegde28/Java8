//package org.example.Scanner;
//
//import java.util.Scanner;
//
//public class CalculatorUsingSwitch {
//    public static void main(String[] args) {
//        System.out.println("********************");
//        System.out.println("Welcome to Calculator");
//        System.out.println("*********************");
//        System.out.println("1. For Addition");
//        System.out.println("2. For Substation");
//        System.out.println("3. For Multiplication");
//        System.out.println("4. For Division");
//        System.out.println("5. For Modulus");
//        System.out.println("Please enter the corresponding number for respective operation");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        switch (input){
//            case 1:
//                System.out.println("You have chosen addition");
//                System.out.println("PLease enter the first  number ");
//                int num1 = scanner.nextInt();
//                System.out.println("PLease enter the second  number ");
//                int num2 = scanner.nextInt();
//                int sum = addition(num1 + num2)
//                System.out.println("The addition result is : " + sum);
//                break;
//            case 2:
//                System.out.println("You have chosen Substation");
//                System.out.println("PLease enter the first  number ");
//                int w1 = scanner.nextInt();
//                System.out.println("PLease enter the second  number ");
//                int w2 = scanner.nextInt();
//                System.out.println("The Substation result is : " + (w1 - w2));
//                break;
//            case 3:
//                System.out.println("You have chosen Multiplication");
//                System.out.println("PLease enter the first  number ");
//                int s1 = scanner.nextInt();
//                System.out.println("PLease enter the second  number ");
//                int s2 = scanner.nextInt();
//                System.out.println("The Multiplication result is : " + (s1 * s2));
//                break;
//            case 4:
//                System.out.println("You have chosen Division");
//                System.out.println("Please enter the first  number ");
//                int t1 = scanner.nextInt();
//                System.out.println("Please enter the second  number ");
//                int t2 = scanner.nextInt();
//                System.out.println("The Division result is : " + (t1 / t2));
//                break;
//            case 5:
//                System.out.println("You have chosen Modulus");
//                System.out.println("Please enter the first  number ");
//                int m1 = scanner.nextInt();
//                System.out.println("Please enter the second  number ");
//                int m2 = scanner.nextInt();
//                System.out.println("The Modulus result is : " + (m1 % m2));
//                break;
//
//            default:
//                System.out.println("Invalid Input");
//
//        }
//    }
//
//    public static int addition(int num1, int num2){
//        return num1+num2;
//    }
//
//    public static int substraction(int num1, int num2){
//        return num1 - num2;
//    }
//
//}
