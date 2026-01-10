package com.day07.skillforge;

public class Student extends User implements ICertifiable {

    private int progress;
    private int grade;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = completedModules * 100 / totalModules;
    }

    public void assignGrade(int marks) {
        grade = marks;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && grade >= 60) {
            System.out.println("Certificate generated for " + name);
        } else {
            System.out.println("Student not eligible for certificate");
        }
    }
}
