package com.constructors.level1;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify private salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access private salary
    public double getSalary() {
        return salary;
    }
}

