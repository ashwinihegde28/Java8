package org.example.wrapperClasses;

public class WrapperClassMethodsDemo {
    public static void main(String[] args) {
        //converts string to int
        int i = Integer.parseInt("123");
        System.out.println(i);

        Integer x = 100;
        int intVal = x.intValue();
        double doubleVal = x.doubleValue();
        System.out.println(intVal);
        System.out.println(doubleVal);


        Double val = Double.valueOf("12.34");
        System.out.println(i);


        //compare mtd compares 2 values and returns an integer indicating whether the first value is less than, equal to, or greater than the second.
        int result = Integer.compare(10, 20);
        System.out.println(result);

        //equals method
        Integer a = 100;
        Integer b = 100;
        System.out.println(a.equals(b));

        //isNaN mtd to check if value is not a number
        Float nanValue = Float.NaN;
        System.out.println("Is 'nanValue' Not a Number (NaN) : "+ nanValue.isNaN());


    }
}
