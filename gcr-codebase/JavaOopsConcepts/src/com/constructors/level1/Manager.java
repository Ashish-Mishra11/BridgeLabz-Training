package com.constructors.level1;

class Manager extends Employee {


    // Constructor
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayDetails() {
        // public variable
        System.out.println("Employee ID: " + employeeID);

        // protected variable
        System.out.println("Department: " + department);

        // private variable via public method
        System.out.println("Salary: ₹" + getSalary());

    }

    public static void main(String[] args) {

        Manager m = new Manager(101, "IT", 75000);

        m.displayDetails();

        // Modify private salary using public method
        m.setSalary(82000);
        System.out.println("Updated Salary: ₹" + m.getSalary());
    }
}

