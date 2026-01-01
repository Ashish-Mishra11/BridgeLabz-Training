package com.inheritance.multilevel.educationalcourse;

public class CourseHierarchyDriver {
	public static void main(String[] args) {
        Course c = new PaidOnlineCourse(
            "Java Programming",
            40,
            "Online Platform",
            true,
            5000,
            1000
        );

        c.displayInfo();
    }

}
