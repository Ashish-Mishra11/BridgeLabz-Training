package com.linkedlists.singly.studentrecordmanagement;
public class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    public StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
