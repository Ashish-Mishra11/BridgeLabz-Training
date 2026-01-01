package com.inheritance.hierarchical.schoolsystem;

public class SchoolSystemDriver {
	public static void main(String[] args) {

        Person p1 = new Teacher("Alice", 35, "Mathematics");
        Person p2 = new Student("Bob", 14, "8th Grade");
        Person p3 = new Staff("Charlie", 40, "Administration");

        p1.displayRole();
        System.out.println();
        p2.displayRole();
        System.out.println();
        p3.displayRole();
    }

}
