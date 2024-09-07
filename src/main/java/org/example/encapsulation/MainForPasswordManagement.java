package org.example.encapsulation;

public class MainForPasswordManagement {
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager("ashwini","pass123");
        pm.authenticateUser("Ashwini","pass123");
    }
}
