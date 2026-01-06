package com.day03.campusconnect;
import java.util.Scanner;

public class CampusConnectDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Faculty ID");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Faculty Name");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty Department");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        System.out.println("Enter Student ID");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name");
        String sname = sc.nextLine();

        System.out.println("Enter Student Email");
        String semail = sc.nextLine();

        Student student = new Student(sid, sname, semail);

        System.out.println("Enter number of grades");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade");
            int grade = sc.nextInt();
            student.addGrade(grade);
        }

        sc.nextLine();

        System.out.println("Enter Course Name");
        String cname = sc.nextLine();

        Course course = new Course(cname, faculty);

        student.enrollCourse(course);

        System.out.println();
        student.printDetails();

        System.out.println();
        faculty.printDetails();

        System.out.println();
        course.printCourseDetails();

        sc.close();
    }
}
