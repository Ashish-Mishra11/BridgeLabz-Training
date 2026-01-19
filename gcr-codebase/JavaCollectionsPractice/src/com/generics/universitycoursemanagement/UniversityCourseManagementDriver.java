package com.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManagementDriver {

    public static void main(String[] args) {

        Course<ExamCourse> csCourse =
                new Course<>("Compiler", "Computer Science", new ExamCourse());

        Course<AssignmentCourse> itCourse =
                new Course<>("Machine learning Development", "Information Technology", new AssignmentCourse());

        Course<ResearchCourse> phdCourse =
                new Course<>("Mathematics Research", "Research Dept", new ResearchCourse());

        System.out.println("---- Course Details ----");
        System.out.println(csCourse);
        System.out.println(itCourse);
        System.out.println(phdCourse);

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        System.out.println("\n---- Evaluation Methods ----");
        CourseUtil.displayCourses(courseTypes);
    }
}