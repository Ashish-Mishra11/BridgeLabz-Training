package com.day01.universitycourseenrollmentsystem;

public class Course {
	private int courseId;
    private String courseName;
    private int credits;

    public Course(int id, String name, int credits) {
        courseId = id;
        courseName = name;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

}
