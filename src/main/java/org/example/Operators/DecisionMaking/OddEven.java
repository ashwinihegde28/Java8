package org.example.Operators.DecisionMaking;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if(num < 0){
            System.out.println("Enter a positive number");
        }
        if(num%2 == 0) {
            System.out.print(num + " is even NUmber" );
        }else{
            System.out.print(num + " is odd NUmber" + num);
        }


    }
}
