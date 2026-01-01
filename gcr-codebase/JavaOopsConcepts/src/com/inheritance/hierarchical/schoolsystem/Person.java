package com.inheritance.hierarchical.schoolsystem;

public class Person {
	protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Generic Person");
    }

}
