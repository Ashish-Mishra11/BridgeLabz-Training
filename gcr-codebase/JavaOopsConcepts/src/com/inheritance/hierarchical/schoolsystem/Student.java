package com.inheritance.hierarchical.schoolsystem;

public class Student extends Person {
	private String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student");
        System.out.println("Grade: " + grade);
    }

}
