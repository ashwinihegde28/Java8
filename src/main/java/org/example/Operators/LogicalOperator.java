package org.example.Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 20;
        int y =20;
        int  a= 25;
        int  b=15;

        System.out.println(x>y || a<b);
        System.out.println(x>=y && a==b);
        System.out.println(!(y<=y && a==b));
        System.out.println(x>y || a<=b);
        System.out.println(x>y && a>=b);
        System.out.println(!(x<=y) || a>=b);
    }
}
