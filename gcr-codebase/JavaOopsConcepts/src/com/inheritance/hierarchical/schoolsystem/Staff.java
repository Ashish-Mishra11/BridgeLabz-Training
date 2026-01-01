package com.inheritance.hierarchical.schoolsystem;

public class Staff extends Person {
	private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff");
        System.out.println("Department: " + department);
    }

}
