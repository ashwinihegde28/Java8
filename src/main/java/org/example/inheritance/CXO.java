package org.example.inheritance;

public class CXO extends Manager{
    public double superBonus;


    public CXO(int age, String name, Address address, double superBonus) {
        super(age, name, address);
        this.superBonus = superBonus;
    }

    public CXO(int age, String name, Address address, int empId, double hourlyAge, double hoursWorked, double superBonus) {
        super(age, name, address, empId, hourlyAge, hoursWorked);
        this.superBonus = superBonus;
    }

    @Override
    public double calculateSalary(double hourlyAge, double hoursWorked) {
        return super.calculateSalary(hourlyAge, hoursWorked)+superBonus;
    }
}
