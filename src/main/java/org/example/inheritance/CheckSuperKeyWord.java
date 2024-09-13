package org.example.inheritance;

public class CheckSuperKeyWord {


    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public CheckSuperKeyWord(int a) {
        this.a = a;
    }
}
 class ChildClass extends CheckSuperKeyWord{
    int b;

     public ChildClass(int a, int b) {
         super(a);
         this.b = b;
         super.setA(b);
     }

//     public ChildClass(int a, int b) {
//
//         super.setA(a );
//         this.b = b;
//     }


 }

