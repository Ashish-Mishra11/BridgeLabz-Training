package com.day03.campusconnect;
public class Course {

    private String courseName;
    private Faculty faculty;
    private Student[] students;
    private int studentCount;

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new Student[20];
        studentCount = 0;
    }

    void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
    }

    void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) {
                students[i] = students[studentCount - 1];
                studentCount--;
                break;
            }
        }
    }

    void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + studentCount);
    }
}
