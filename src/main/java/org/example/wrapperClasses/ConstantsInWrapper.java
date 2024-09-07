package org.example.wrapperClasses;

public class ConstantsInWrapper {
    public static void main(String[] args) {

        System.out.println("Type of Short is : "+ Short.TYPE);

        System.out.println("Size of Long is " +Long.SIZE);

        System.out.println("The largest double value is : " + Double.MAX_VALUE);
        System.out.println("The smallest double value is : " + Double.MIN_VALUE);
        System.out.println("The largest byte value is : " + + Byte.MAX_VALUE);
        System.out.println("The smallest byte value is : " + + Byte.MIN_VALUE);

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        double result = Math.sqrt(-10);
        System.out.println("Result is NOT A Number" + Double.isNaN(result));


    }
}
