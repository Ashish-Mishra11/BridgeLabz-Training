package com.constructors.level1;

class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter
    public double getCGPA() {
        return cgpa;
    }

    // Public setter
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}
