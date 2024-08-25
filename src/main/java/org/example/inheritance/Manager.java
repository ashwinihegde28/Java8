package org.example.inheritance;

public class Manager extends Employee{

    double bonus;
    public Manager(int age, String name, Address address) {
        super(age, name, address);
    }

    public Manager(int age, String name, Address address, int empId, double hourlyAge, double hoursWorked) {
        super(age, name, address, empId, hourlyAge, hoursWorked);
    }

    @Override
    public double calculateSalary(double hourlyAge, double hoursWorked) {
        return super.calculateSalary(hourlyAge, hoursWorked) + bonus;
    }
}
