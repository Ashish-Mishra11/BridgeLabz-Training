package com.day04.petpal;
class Bird extends Pet implements IInteractable {

    Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        System.out.println(name + " pecked seeds");
    }

    @Override
    public void play() {
        decreaseEnergy(8);
        increaseHunger(6);
        System.out.println(name + " is flying around");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " is resting");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
