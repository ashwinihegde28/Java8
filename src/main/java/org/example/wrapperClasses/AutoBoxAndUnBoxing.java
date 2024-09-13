package org.example.wrapperClasses;


public class AutoBoxAndUnBoxing {
    public static void main(String[] args) {

//       // Manual boxing
//        int num = 5;
//        Integer intObj1 = Integer.valueOf(num);

        // Auto boxing
        Integer intObj1 = 1000;

        int i = intObj1;
        System.out.println("IntegerObject : " + intObj1 + " and int object is : " + i);





// Passing an int to the mtd1 that expects Integer.
// First the value is auto-boxed to Integer and
// also the returned value int is also auto-boxed to Integer
        Integer intObj2 = mtd1(2000);
        System.out.println("Integer value is : " + intObj2);
    }

    static int mtd1(Integer v) {

        return v;       //auto-unboxed to int
    }
}



