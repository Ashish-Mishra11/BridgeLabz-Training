package com.day04.petpal;
class Dog extends Pet implements IInteractable {

    Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        decreaseHunger(20);
        System.out.println(name + " enjoyed the food");
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseHunger(10);
        System.out.println(name + " played fetch");
    }

    @Override
    public void sleep() {
        increaseEnergy(25);
        System.out.println(name + " is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
