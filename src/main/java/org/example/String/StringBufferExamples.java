package org.example.String;

public class StringBufferExamples {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("Java");
        buff.append("8");
        System.out.println("After appending the string looks like this : " + buff);
        StringBuffer str1 = new StringBuffer("abc-xyz");
        str1.reverse();
        System.out.println("After reversing the string 'abc-xyz' looks like this " + str1);
        buff.insert(4,"-");
        System.out.println(buff);
        System.out.println("The length of the 'Java-8' is " + buff.length());
        System.out.println("Character at index 1 is " + buff.charAt(1));

    }
}
