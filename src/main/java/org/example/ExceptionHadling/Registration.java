package org.example.ExceptionHadling;

public class Registration {
//    String firstName = "Ashwini";
//    String lastname = "Hegde";

    public static void validatename(String firstName, String lastname){
        try{
        String name = firstName.toUpperCase() + lastname.toLowerCase();

        System.out.println("Name in Upper case " + name);}
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
validatename("Ashwini", "Hegde");
        System.out.println("Program Executed");
    }
}
