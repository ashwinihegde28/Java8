package org.example.problems.employeeManagementSystem;

public class FullTimeEmployee extends Emp{

    private int annualLeaveDays;
    public int getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    public void setAnnualLeaveDays(int annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }




    public FullTimeEmployee(int id, String name, double salary, int annualLeaveDays) {
        super(id, name, salary);
        this.annualLeaveDays = annualLeaveDays;
    }

   @Override
   public double calculateBonus() {
       return getSalary() * 0.10;
   }

    @Override
    public String toString() {
        return super.toString() + ", Annual Leave Days=" + annualLeaveDays + ", Bonus=" + calculateBonus();
    }
}
