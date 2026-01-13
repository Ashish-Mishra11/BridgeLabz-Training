package com.day02.traincompanion;
import java.util.Scanner;

public class TrainCompanionDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainCompanionList train = new TrainCompanionList();

        int choice;

        do {
            System.out.println("1 Add Compartment");
            System.out.println("2 Remove Compartment");
            System.out.println("3 Traverse Forward");
            System.out.println("4 Traverse Backward");
            System.out.println("5 Show Adjacent Compartments");
            System.out.println("6 Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter compartment name: ");
                    train.addCompartment(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter compartment name: ");
                    train.removeCompartment(sc.nextLine());
                    break;

                case 3:
                    train.moveForward();
                    break;

                case 4:
                    train.moveBackward();
                    break;

                case 5:
                    System.out.print("Enter compartment name: ");
                    train.showAdjacent(sc.nextLine());
                    break;

                case 6:
                    System.out.println("Exiting system");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}
