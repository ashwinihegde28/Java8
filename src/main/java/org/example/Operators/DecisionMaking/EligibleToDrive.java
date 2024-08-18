package org.example.Operators.DecisionMaking;

public class EligibleToDrive {
    public static void main(String[] args) {
        int age = 35;
        isEligible(age);

    }

    public static void isEligible(int age){
        if(age < 16){
            System.out.println("Are not Eligible");
        } else if (age >=16 && age <=19) {
            System.out.println( "Can have Learning Licence");
        }
        else{
             System.out.println("You can drive without any restriction");
        }
    }
}
