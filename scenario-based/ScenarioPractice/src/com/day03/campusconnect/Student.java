package com.day03.campusconnect;
public class Student extends Person implements ICourseActions {

    private int[] grades;
    private int gradeCount;

    Student(int id, String name, String email) {
        super(id, name, email);
        grades = new int[10];
        gradeCount = 0;
    }

    public void addGrade(int grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }

    public double calculateGPA() {
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum = sum + grades[i];
        }
        if (gradeCount == 0)
            return 0;
        return (double) sum / gradeCount;
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        course.removeStudent(this);
    }

    void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + calculateGPA());
    }
}
