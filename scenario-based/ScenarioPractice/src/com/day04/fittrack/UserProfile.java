package com.day04.fittrack;
class UserProfile {
    private String name;
    private int age;
    private double weight;
    private String goal;
    private int dailyCalorieTarget;

    UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Maintain Fitness";
        this.dailyCalorieTarget = 2000;
    }

    UserProfile(String name, int age, double weight, String goal, int target) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = target;
    }

    public int getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

    public String getName() {
        return name;
    }
}
