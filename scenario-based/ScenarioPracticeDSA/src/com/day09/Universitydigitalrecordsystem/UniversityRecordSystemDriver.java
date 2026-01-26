package com.day09.Universitydigitalrecordsystem;

public class UniversityRecordSystemDriver {
    public static void main(String[] args) {
        BST bst = new BST();

       
        bst.insert(new Student("22CS001", "Ashish", "CSE", 2));
        bst.insert(new Student("22CS015", "Priya", "CSE", 2));
        bst.insert(new Student("22EC007", "Reem", "ECE", 2));
        bst.insert(new Student("22ME003", "Suyash", "MECH", 2));
        bst.insert(new Student("22CS010", "Kin", "CSE", 2));

        
        System.out.println("Students sorted by roll number:");
        for (Student s : bst.getSortedStudents()) {
            System.out.println(s);
        }

        
        System.out.println("\nDeleting 22CS010...");
        bst.delete("22CS010");

        
        Student found = bst.search("22CS015");
        System.out.println("\nSearch result:");
        System.out.println(found != null ? found : "Not found");

        
        System.out.println("\nFinal list:");
        for (Student s : bst.getSortedStudents()) {
            System.out.println(s);
        }
    }
}