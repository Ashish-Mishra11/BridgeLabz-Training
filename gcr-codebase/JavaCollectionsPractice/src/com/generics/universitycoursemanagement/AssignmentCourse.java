package com.generics.universitycoursemanagement;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignments & Quizzes");
    }

    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}