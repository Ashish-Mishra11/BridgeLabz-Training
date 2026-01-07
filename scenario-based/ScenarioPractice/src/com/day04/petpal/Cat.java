package com.day04.petpal;
class Cat extends Pet implements IInteractable {

    Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        decreaseHunger(15);
        System.out.println(name + " ate quietly");
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseHunger(8);
        System.out.println(name + " played with yarn");
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is napping");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
