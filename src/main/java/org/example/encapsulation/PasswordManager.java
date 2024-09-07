package org.example.encapsulation;

public class PasswordManager {

    private String userName;
    private String password;

    public PasswordManager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void authenticateUser(String userName, String password){
        if(this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("User Authenticated Successfully");
        }
        else{
            System.out.println("Invalid userName or Password");
        }
    }

    @Override
    public String toString() {
        return "PasswordManager{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
