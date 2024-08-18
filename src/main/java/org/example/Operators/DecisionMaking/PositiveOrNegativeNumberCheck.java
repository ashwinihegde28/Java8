package org.example.Operators.DecisionMaking;

public class PositiveOrNegativeNumberCheck {
    public static void main(String[] args) {
        int n = -8;
        checkPositivity(n);

    }

    public static void checkPositivity(int n){
        String res = (n>0)? "Positive":"Negative";

        System.out.println("Number is "+ res);
    }
}
