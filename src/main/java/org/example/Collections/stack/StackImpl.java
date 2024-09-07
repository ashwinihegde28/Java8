package org.example.Collections.stack;

public class StackImpl {
    int[] stack = new int[10];
    int tos;

    StackImpl() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty cannot remove items");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public static void main(String[] args) {
        StackImpl s1 = new StackImpl();
        StackImpl s2 = new StackImpl();

        for (int i = 10; i < 20; i++)
            s1.push(i)
                    ;

        for (int i = 0; i < 10; i++)
            s2.push(i);
        System.out.println("Stack 1 contents");
        for (int i = 0; i < 10; i++) {
            System.out.println(s1.pop());
        }

        System.out.println("Stack 2 contents");
        for (int i = 0; i < 10; i++) {
            System.out.println(s2.pop());
        }
    }
}
