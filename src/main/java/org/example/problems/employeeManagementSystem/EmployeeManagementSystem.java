package org.example.problems.employeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Emp[] employees = new Emp[4];
        employees[0] = new FullTimeEmployee(1, "Ashwini Hegde", 10000, 30);
        employees[1] = new PartTimeEmployee(2, "Prasanna LM", 20000, 25);
        employees[2] = new FullTimeEmployee(3, "Achintya LP", 60000, 30);
        employees[3] = new FullTimeEmployee(4, "Asma S", 80000, 30);


        for (Emp emp : employees) {
            System.out.println(emp.getSalary());
        }
    }
}
