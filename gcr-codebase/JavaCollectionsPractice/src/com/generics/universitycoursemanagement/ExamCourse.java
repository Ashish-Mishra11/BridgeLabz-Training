package com.generics.universitycoursemanagement;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Written Examination");
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}