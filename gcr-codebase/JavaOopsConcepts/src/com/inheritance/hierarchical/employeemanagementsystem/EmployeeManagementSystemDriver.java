package com.inheritance.hierarchical.employeemanagementsystem;

public class EmployeeManagementSystemDriver {
	public static void main(String[] args) {

        Employee e1 = new Manager("Anita", 101, 80000, 10);
        Employee e2 = new Developer("Rahul", 102, 60000, "Java");
        Employee e3 = new Intern("Neha", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }

}
