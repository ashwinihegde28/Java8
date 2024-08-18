package org.example.ClassesIntro;

public class MainForStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.read();
        student.sleep();
        System.out.println(student.id);
    }
}
