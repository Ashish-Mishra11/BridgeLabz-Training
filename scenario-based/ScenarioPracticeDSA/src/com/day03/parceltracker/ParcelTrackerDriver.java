package com.day03.parceltracker;
import java.util.Scanner;

public class ParcelTrackerDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelChain chain = new ParcelChain();

        chain.addStage("Packed");
        chain.addStage("Shipped");
        chain.addStage("In Transit");
        chain.addStage("Delivered");

        System.out.print("Add custom checkpoint yes or no ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {

            System.out.print("Enter existing stage ");
            String existingStage = sc.nextLine();

            System.out.print("Enter new checkpoint ");
            String newStage = sc.nextLine();

            chain.addCheckpoint(existingStage, newStage);
        }

        chain.trackParcel();

        sc.close();
    }
}
