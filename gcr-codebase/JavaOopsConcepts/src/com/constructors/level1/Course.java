package com.constructors.level1;

class Course {

    String courseName;
    int duration;      // in months
    double fee;


    static String instituteName = "ABC INSTITUTE";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " months");
        System.out.println("Fee           : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python", 4, 30000);

        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("XYZ INSTITUTE");

        System.out.println("After Updating Institute Name:\n");

        c1.displayCourseDetails();
        System.out.println();

        c2.displayCourseDetails();
    }
}
