package com.objectmodeling.level1;
import java.util.ArrayList;

public class School {
	String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
