package com.day01.universitycourseenrollmentsystem;

public class UniversitySystemDriver {
	public static void main(String[] args) {

        Course java = new Course(101, "Java Programming", 4);

        Student ug = new Undergraduate(1, "Anuradha");
        Student pg = new Postgraduate(2, "Rahul", java);

        Faculty faculty = new Faculty(201, "Dr. Mehta");

        new Enrollment(ug, java);
        new Enrollment(pg, java);

        faculty.gradeStudent((Graded) ug, 85);
        faculty.gradeStudent((Graded) pg, 45);

        ug.printTranscript();
        System.out.println();
        pg.printTranscript();
    }

}
