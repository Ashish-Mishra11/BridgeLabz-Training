package com.day07.skillforge;

import java.util.Scanner;

public class SkillForgeDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter instructor name: ");
        String insName = sc.nextLine();

        System.out.print("Enter instructor email: ");
        String insEmail = sc.nextLine();

        Instructor instructor = new Instructor(insName, insEmail);

        System.out.print("Enter course title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter course level Beginner Intermediate Advanced: ");
        String level = sc.nextLine();

        System.out.print("Enter number of modules: ");
        int m = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter module " + (i + 1) + " name: ");
            modules[i] = sc.nextLine();
        }

        Course course = new Course(courseTitle, instructor, level, modules);
        instructor.uploadCourse(courseTitle);

        System.out.print("Enter student name: ");
        String stuName = sc.nextLine();

        System.out.print("Enter student email: ");
        String stuEmail = sc.nextLine();

        Student student = new Student(stuName, stuEmail);

        System.out.print("Enter completed modules count: ");
        int completed = sc.nextInt();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        student.updateProgress(completed, course.getModuleCount());
        student.assignGrade(marks);

        course.showCertificateFormat();
        student.generateCertificate();

        sc.close();
    }
}
