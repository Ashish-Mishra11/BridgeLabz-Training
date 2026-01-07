package com.day04.fittrack;
class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
        this.caloriesBurned = duration * 6;
    }

    @Override
    public int calculateCalories() {
        return duration * 7;
    }
}
