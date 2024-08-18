package org.example.staticIntro;

public class MainForStudent {
    public static void main(String[] args) {
        Student s1 = new Student("s1","s1@gmail.com","Canada");
        System.out.println("School of s1 is "+ s1.school);
        System.out.println(s1);
        Student s2 = new Student("s2","s2@gmail.com","Canada");
        System.out.println("School of s2 is "+s2.school);
        System.out.println(s2);
        Student s3 = new Student("s3","s3@gmail.com","Canada");
        System.out.println("School of s3 is "+s3.school);
        System.out.println(s3);
        Student s4 = new Student("s4","s4@gmail.com","Canada");
        System.out.println("School of s4 is "+ s4.school);
        System.out.println(s4);
    }
}
