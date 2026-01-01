package com.encapsulation.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystemDriver {
	public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Anita", 0, 60000);
        Employee e2 = new PartTimeEmployee(102, "Rahul", 0, 80, 500);

        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            System.out.println();
        }
    }

}
