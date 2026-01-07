package com.day04.fittrack;
class Workout implements ITrackable {
    protected String type;
    protected int duration;
    protected int caloriesBurned;

    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }

    public int calculateCalories() {
        return caloriesBurned;
    }
}
