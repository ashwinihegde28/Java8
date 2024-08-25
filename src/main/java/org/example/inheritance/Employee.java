package org.example.inheritance;

public class Employee extends Person {
    private int empId;
    private double hourlyRate;

    double hoursWorked;


    public Employee(int age, String name, Address address) {
        super(age, name, address);
    }

    public Employee(int age, String name, Address address, int empId, double hourlyRate, double hoursWorked) {
        super(age, name, address);
        this.empId = empId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;


    }

    public double calculateSalary(double hourlyRate, double hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

