package org.example.String;
import java.lang.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("After appending sb is "+ sb);
        sb.insert(10, " is Beautiful ");
        System.out.println("After Insert mtd sb is "+ sb);
        StringBuilder reversedString = sb.reverse();
        System.out.println("After reversed String builder is  "+ reversedString);
        System.out.println("Length of the string builder is " + sb.length());
        StringBuilder sb1 = new StringBuilder("Ashwini");
        System.out.println("Character at index 1 is " + sb1.charAt(1));
    }
}
