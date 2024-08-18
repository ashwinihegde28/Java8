package org.example.Operators.DecisionMaking;

public class LeapYear {
    public static void main(String[] args) {
        int yr = 2024;

        String isLeap = isLeapyr(yr)? "leap year":"Not leap year";
        System.out.println("Given yr " + yr + " is " + isLeap);
    }

    public static boolean isLeapyr(int yr) {
        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                return yr % 400 == 0;
            }
        }
        return true;

    }


}
