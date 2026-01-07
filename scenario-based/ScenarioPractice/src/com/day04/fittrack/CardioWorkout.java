package com.day04.fittrack;
class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
        this.caloriesBurned = duration * 8;
    }

    @Override
    public int calculateCalories() {
        return duration * 10;
    }
}
