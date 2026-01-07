package com.day04.petpal;
import java.util.Scanner;

public class PetPalDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose pet 1 Dog 2 Cat 3 Bird");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter pet name");
        String name = sc.nextLine();

        System.out.println("Enter pet age");
        int age = sc.nextInt();

        Pet pet;

        if (choice == 1) {
            pet = new Dog(name, age);
        } else if (choice == 2) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        pet.makeSound();
        pet.showStatus();

        System.out.println("Choose action 1 Feed 2 Play 3 Sleep");
        int action = sc.nextInt();

        IInteractable interact = (IInteractable) pet;

        if (action == 1) {
            interact.feed();
        } else if (action == 2) {
            interact.play();
        } else {
            interact.sleep();
        }

        pet.showStatus();
        
        sc.close();
    }
}
