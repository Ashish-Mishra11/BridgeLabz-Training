package com.day01.universitycourseenrollmentsystem;

public class Postgraduate extends Student implements Graded {
	public Postgraduate(int id, String name, Course course) {
        super(id, name, course);
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        System.out.println(name + " enrolled in PG course " + course.getCourseName());
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 50)
            setGpa(4.0);   // Pass
        else
            setGpa(0.0);   // Fail
    }


}
