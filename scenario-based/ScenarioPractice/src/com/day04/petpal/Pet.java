package com.day04.petpal;
import java.util.Random;

class Pet {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;
        this.energy = r.nextInt(50) + 30;
        updateMood();
    }

    Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    protected void increaseEnergy(int value) {
        energy = energy + value;
        if (energy > 100) {
            energy = 100;
        }
        updateMood();
    }

    protected void decreaseEnergy(int value) {
        energy = energy - value;
        if (energy < 0) {
            energy = 0;
        }
        updateMood();
    }

    protected void decreaseHunger(int value) {
        hunger = hunger - value;
        if (hunger < 0) {
            hunger = 0;
        }
        updateMood();
    }

    protected void increaseHunger(int value) {
        hunger = hunger + value;
        if (hunger > 100) {
            hunger = 100;
        }
        updateMood();
    }

    private void updateMood() {
        if (energy > 60 && hunger < 40) {
            mood = "Happy";
        } else if (energy < 30) {
            mood = "Tired";
        } else {
            mood = "Normal";
        }
    }

    public void showStatus() {
        System.out.println(name + " Mood: " + mood + " Energy: " + energy + " Hunger: " + hunger);
    }

    public void makeSound() {
        System.out.println("Pet makes a sound");
    }
}
