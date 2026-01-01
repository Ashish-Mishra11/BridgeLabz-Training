package com.inheritance.hierarchical.schoolsystem;

public class Teacher extends Person {
	private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher");
        System.out.println("Subject: " + subject);
    }

}
