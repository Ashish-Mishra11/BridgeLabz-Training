package com.day09.Universitydigitalrecordsystem;

class Node {
    Student data;
    Node left;
    Node right;

    public Node(Student data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}