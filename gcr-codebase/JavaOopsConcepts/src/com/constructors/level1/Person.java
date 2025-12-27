package com.constructors.level1;

public class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Display section: Method to display details
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Ashish", 22);

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        // Method calling
        p1.displayPerson();

        System.out.println();

        System.out.println("Copied Person:");
        // Method calling
        p2.displayPerson();
    }

}
