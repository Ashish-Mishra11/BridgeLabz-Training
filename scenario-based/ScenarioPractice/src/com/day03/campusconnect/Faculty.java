package com.day03.campusconnect;
public class Faculty extends Person {

    private String department;

    Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Role: Faculty");
        System.out.println("Department: " + department);
    }
}
