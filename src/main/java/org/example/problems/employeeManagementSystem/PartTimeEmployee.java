package org.example.problems.employeeManagementSystem;

public class PartTimeEmployee extends Emp {

    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public PartTimeEmployee(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05 * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hours Worked=" + hoursWorked + ", Bonus=" + calculateBonus();
    }
}
