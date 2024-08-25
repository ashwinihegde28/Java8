package org.example.inheritance;

public class Company {
    public static void main(String[] args) {
        Address address1 = new Address(" Street1", "123", "Whitby", "ABCDEF13");
        Address address2 = new Address("Street2", "67", "Torono", "M8VF13");
        Address address3 = new Address("Street3", "89", "Burlington", "L1RF13");
        Person person = new Person(100, "Mr ABC", address1);


        Employee employee = new Employee(101, "Mr XYZ Smith", address1, 1901, 50.6, 40);
        double employeeSalary = employee.calculateSalary(employee.getHourlyRate(), employee.hoursWorked);
        System.out.println("Employee Salary: " + employeeSalary);

        Manager manager = new Manager(3, "Mr Manager", address2, 102, 30.0, 40);
        manager.bonus = 500.0; // Assigning a bonus to the manager
        double managerSalary = manager.calculateSalary(manager.getHourlyRate(), manager.hoursWorked);
        System.out.println("Manager Salary including bonus): " + managerSalary);

        CXO cxo = new CXO(45, "Alice Brown", address3, 103, 50.0, 40, 1000.0);
        double cxoSalary = cxo.calculateSalary(cxo.getHourlyRate(), cxo.hoursWorked) + cxo.superBonus;
        System.out.println("CXO Salary including super bonus: " + cxoSalary);
    }



}
