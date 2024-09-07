package org.example.wrapperClasses;

public class WrapperClassesCachingExample {
    public static void main(String[] args) {
        //example of Integer caching - Caches values from Integer values in the range of -128 to 127 else creates a new object
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println(a == b);

        Integer x = Integer.valueOf(1000);
        Integer y = Integer.valueOf(1000);
        System.out.println(x == y);

        // Examples of Character -  Caches values from \u0000 to \u007F (0 to 127) else creates a new object
        Character c1 = Character.valueOf('A');
        Character c2 = Character.valueOf('A');
        System.out.println(c1 == c2);

        Character c3 = Character.valueOf('©');
        Character c4 = Character.valueOf('©');
        System.out.println(c3 == c4);

    }
}
