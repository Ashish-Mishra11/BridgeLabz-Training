package com.day07.skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private String level;
    private final String[] reviews;

    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[] { "Intro", "Basics" };
        this.reviews = new String[] { "Good" };
    }

    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        this.reviews = new String[] { "Excellent" };
    }

    protected void updateRating(double newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = newRating;
        }
    }

    public int getModuleCount() {
        return modules.length;
    }

    public void showCertificateFormat() {
        if (level.equalsIgnoreCase("Beginner")) {
            System.out.println("Beginner Level Certificate");
        } else if (level.equalsIgnoreCase("Advanced")) {
            System.out.println("Advanced Level Certificate");
        } else {
            System.out.println("Standard Certificate");
        }
    }

    public String[] getReviews() {
        return reviews;
    }
}
