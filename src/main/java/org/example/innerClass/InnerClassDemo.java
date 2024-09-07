package org.example.innerClass;

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();
    }
}

class OuterClass {
    int outer_x = 10;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Calling outer x and value is " + outer_x);
        }
    }
}
