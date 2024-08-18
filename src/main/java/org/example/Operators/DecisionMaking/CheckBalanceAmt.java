package org.example.Operators.DecisionMaking;

public class CheckBalanceAmt {
    public static void main(String[] args) {
        double balance = 350.50;
        if(balance < 0){
            System.out.println();
        }
        checkBalance(balance);
    }

    public static void checkBalance(double balance){
        if(balance >= 1000){
            System.out.println("Healthy Balanace");
        } else if (balance <= 999 && balance >= 500) {
            System.out.println("Adequate Balanace");
        } else if (balance <= 499 && balance >= 100) {
            System.out.println("Balance is Low");
        }
        else {
            System.out.println("Balance is very Low");
        }
    }
}
