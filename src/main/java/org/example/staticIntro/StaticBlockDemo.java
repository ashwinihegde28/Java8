//Order of execution
// 1. Static block
// 2.Instance block
// 3.Constructor
// 4. then any mtds


package org.example.staticIntro;

public class StaticBlockDemo {
    //first thing that will be run
    static {
        System.out.println("Inside the static block");
    }

    //InsanceBlock
    {
        System.out.println("Inside the Instance block");
    }

    public StaticBlockDemo() {
        System.out.println("Inside the default constructor");
    }

    public void test(){
        System.out.println("Inside the test Method");
    }
    public static void main(String[] args) {
        StaticBlockDemo s1 = new StaticBlockDemo();
        s1.test();
    }
}
