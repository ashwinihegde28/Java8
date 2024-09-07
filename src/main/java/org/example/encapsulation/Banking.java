package org.example.encapsulation;

public class Banking {
    public static void main(String[] args) {
        Account account = new Account("Ashwini", 100.0);
        System.out.println("Account holder name is : " + account.getAccountHolderName());
        checkBalance(account);
        Deposit(account, 10);
        withdrawAmt(account, 38);
    }

    public static void checkBalance(Account account) {
        if(account != null){
        System.out.println("Current Balance in the account of " + account.getAccountHolderName() + " is : " + account.getBalance());
    }
    else {
            System.out.println("Invalid Account");
        }
    }

    public static  void Deposit(Account account , double amount){
        if(account == null || amount< 0){
            System.out.println("Invalid Account or Amount");
        }
        else{
            account.setBalance(account.getBalance() + amount);
            System.out.println("Balance after depositing is : " + account.getBalance());

        }

    }

    public static  void withdrawAmt(Account account , double amount){
        if(account == null || amount < 0){
            System.out.println("Invalid Account or Amount");
        }
        else{
            if(account.getBalance() > amount){
                account.setBalance(account.getBalance() - amount);
            }
            else {
                System.out.println("Sorry Insufficient balance");
                System.out.println("Balance after Withdrawal is : " + account.getBalance());
            }
        }
    }
}
