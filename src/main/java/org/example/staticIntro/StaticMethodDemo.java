package org.example.staticIntro;

public class StaticMethodDemo {
    public static void main(String[] args) {
        // no need to create an object of type staticMethodDemo but only can use the reference that's the class name
        staticMethodDemo.display();
    }
}

 class staticMethodDemo{
    public static void display(){
         System.out.println("Inside Display staticMethodDemo");
     }
 }
