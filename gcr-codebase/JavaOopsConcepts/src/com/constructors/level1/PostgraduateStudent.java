package com.constructors.level1;

class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);       // protected
        System.out.println("CGPA: " + getCGPA());  // private via method
        System.out.println("Specialization : " + specialization);
    }

    public static void main(String[] args) {

        PostgraduateStudent pg =
                new PostgraduateStudent(11, "Ashish", 8.9, "Computer Science");

        pg.displayDetails();

        pg.setCGPA(9.2);
        System.out.println("Updated CGPA   : " + pg.getCGPA());
    }
}

