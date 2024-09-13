package org.example.ExceptionHadling;

public class Bank {

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;


    public Bank(double balance) {
        this.balance = balance;
    }

    public double withdraw(double withdraw){
        if(balance < withdraw){
//            System.out.println("Cannot withdraw as balance is lower than withdraw amount");
            throw new InsufficientBalanceException("Insufficient balance to withdraw");
        }
        balance = balance - withdraw;
        return balance;
    }

    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }
}
