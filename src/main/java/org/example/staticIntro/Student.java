package org.example.staticIntro;

public class Student {
     String name;
     String email;
     static String  school = "pragra";
     String address;

    public Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
