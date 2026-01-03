package com.day01.universitycourseenrollmentsystem;

public abstract class Student {
	protected int studentId;
    protected String name;
    protected Course course;

    private double gpa;   // secure internal data

    // Constructor without electives
    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int id, String name, Course course) {
        this.studentId = id;
        this.name = name;
        this.course = course;
    }

    // Encapsulation
    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printTranscript() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("GPA: " + gpa);
    }

    public abstract void enrollCourse(Course course);

}
