package com.constructors.level1;

public class Circle {

    double radius;

    Circle() {
        this(0.0); // constructor chaining
        System.out.println("Default constructor called");
    }

    Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterized constructor called");
    }

    // Method section: Method to display the results 
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        // Object creation using  default constructor
        Circle c1 = new Circle();
        c1.displayRadius();

        System.out.println();

        // Object creation using parameterized constructor
        Circle c2 = new Circle(11);
        c2.displayRadius();
    }
}
