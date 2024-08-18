package org.example.ClassesIntro;

public class OverLoadingExample {

    public static void main(String[] args) {
        OverLoadingExample obj = new OverLoadingExample();
        obj.printDetails("Ashwini");
        obj.printDetails("Ashwini", "ashwini10000000000@gmail.com");
        obj.printDetails("Ashwini","ashwini10000000000@gmail.com", 1234567899);
    }

    public void printDetails(String name){
        System.out.println("Hello "+ name);
    }

    public void printDetails(String name, String email){
        System.out.println("Hello "+ name + " Your address is "+email);
    }

    public void printDetails(String name, String email, int phoneNumber){
        System.out.println("Hello "+ name + " Your address is "+email + " and the Phone number is "+ phoneNumber);
    }

}


