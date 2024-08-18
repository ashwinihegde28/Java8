package org.example.String;

public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "test";
        System.out.println(s1.concat(" Hello"));
        System.out.println(s1);
        System.out.println(s1.isEmpty());
        char c = s1.charAt(2);
        System.out.print("The character at index 2 is : ");
        System.out.println(c);
        String s3 = new String("test");
        System.out.println("Is s1 and s3 are equal ? " + (s1==s3));
        System.out.println("Uppercase os s1 -> "+ s1.toUpperCase() + " Lowercase of s2 is " + s1.toLowerCase());
        char[] stringArray = s1.toCharArray();
        System.out.print("S1 is converted to array -> " );
        for (char c1:
                stringArray) {
            System.out.println(c1);
        }
        System.out.println("");
        String s5 = "abc ";
        System.out.println("After trimmming s5 -> " + s5);

        String str1 = "abcabc";
        String replacedString = str1.replace('c', 'z');
        System.out.println("After replaceing character c with z the string looks like this : " + replacedString);
        String str3 = "";
        String str4= "   ";
        //Blank means nothing including blank space
        System.out.println("Is str3 bank ? " + str3.isBlank());
        System.out.println("Is str4 bank ? " + str4.isBlank());

        //Empty means nothing and not even a single space
        System.out.println("Is str3 Empty ? " + str3.isEmpty());
        System.out.println("Is str4 Empty ? " + str4.isEmpty());


    }
}
