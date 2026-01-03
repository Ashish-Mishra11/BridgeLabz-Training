package com.day01.universitycourseenrollmentsystem;

public class Undergraduate extends Student implements Graded {
	public Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void assignGrade(double marks) {
        double gpaValue;

        if (marks >= 90)
            gpaValue = 4.0;
        else if (marks >= 75)
            gpaValue = 3.0;
        else if (marks >= 60)
            gpaValue = 2.0;
        else
            gpaValue = 1.0;

        setGpa(gpaValue);
    }

}
