package org.example.ExceptionHadling;

public class MainForBank {
    public static void main(String[] args) {
        Bank account = new Bank(1000.0);
        System.out.println("Current balance " + account.getBalance());

        account.deposit(1500);
        System.out.println("Current balance after Deposit " + account.getBalance());
        try {
            account.withdraw(3000);
            System.out.println("Current balance after withdraw " + account.getBalance());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
