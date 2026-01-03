package com.day01.universitycourseenrollmentsystem;

public class Faculty {
	private int facultyId;
    private String facultyName;

    public Faculty(int id, String name) {
        facultyId = id;
        facultyName = name;
    }

    public void gradeStudent(Graded student, double marks) {
        student.assignGrade(marks);
    }

}
