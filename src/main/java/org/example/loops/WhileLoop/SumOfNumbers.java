package org.example.loops.WhileLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Adding numbers from 1 to 10 using While loop");
        int no = 1;
        int sum = 0;
        while(no <= 10){
            sum = sum + no;
            no ++;
        }
        System.out.println("And the sum is " + sum);
    }

}
