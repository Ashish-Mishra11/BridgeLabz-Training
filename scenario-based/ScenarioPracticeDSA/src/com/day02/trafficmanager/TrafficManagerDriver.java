package com.day02.trafficmanager;
import java.util.Scanner;

public class TrafficManagerDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(5);

        int choice;

        do {
            System.out.println("1 Vehicle arrives");
            System.out.println("2 Move vehicle to roundabout");
            System.out.println("3 Vehicle exits roundabout");
            System.out.println("4 Show roundabout");
            System.out.println("5 Show waiting queue");
            System.out.println("6 Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    queue.enqueue(sc.nextLine());
                    break;

                case 2:
                    String vehicle = queue.dequeue();
                    if (vehicle != null) {
                        roundabout.addVehicle(vehicle);
                    }
                    break;

                case 3:
                    roundabout.removeVehicle();
                    break;

                case 4:
                    roundabout.displayRoundabout();
                    break;

                case 5:
                    queue.displayQueue();
                    break;

                case 6:
                    System.out.println("System closed");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}
