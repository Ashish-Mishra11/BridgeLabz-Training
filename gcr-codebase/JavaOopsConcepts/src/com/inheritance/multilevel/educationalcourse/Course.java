package com.inheritance.multilevel.educationalcourse;

public class Course {
	protected String courseName;
    protected int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }

}
