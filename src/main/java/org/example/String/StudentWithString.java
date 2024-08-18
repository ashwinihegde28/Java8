package org.example.String;

public class StudentWithString {
    int rollNum;
    String name;
    String lastName;
    String email;

    public StudentWithString(int rollNum, String name, String lastName, String email) {
        this.rollNum = rollNum;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentWithString{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
