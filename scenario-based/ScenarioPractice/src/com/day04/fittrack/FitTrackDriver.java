package com.day04.fittrack;
import java.util.Scanner;

public class FitTrackDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter weight");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter goal");
        String goal = sc.nextLine();

        System.out.println("Enter daily calorie target");
        int target = sc.nextInt();

        UserProfile user = new UserProfile(name, age, weight, goal, target);

        System.out.println("Choose workout type 1 Cardio 2 Strength");
        int choice = sc.nextInt();

        System.out.println("Enter workout duration in minutes");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();

        int calories = workout.calculateCalories();

        workout.stopWorkout();

        int remainingCalories = user.getDailyCalorieTarget() - calories;

        System.out.println("User: " + user.getName());
        System.out.println("Calories Burned: " + calories);
        System.out.println("Remaining Daily Calories: " + remainingCalories);
        
        sc.close();
    }
}
