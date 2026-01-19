package com.generics.universitycoursemanagement;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Paper & Presentation");
    }

    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}