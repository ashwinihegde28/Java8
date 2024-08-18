package org.example.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = scanner.next();
        System.out.println("Reversed String : "+ reverseString(str));

    }

    public static String reverseString(String str){
        if(str!= null){
            char[] c = str.toCharArray();
            int start = 0;
            int end = c.length - 1;
            while (start < end  ) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start ++;
                end --;
            }
            return new String(c);
        }
        System.out.println("Invalid string ");
        return "";
      }


}
