package com.day02.cabbygo;
import java.util.Scanner;

public class CabbyGoAppDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter Driver Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Driver driver = new Driver(dName, license, rating);

        // Vehicle input
        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vNumber = sc.nextLine();

        Vehicle vehicle;
        switch (choice) {
            case 1 -> vehicle = new Mini(vNumber);
            case 2 -> vehicle = new Sedan(vNumber);
            case 3 -> vehicle = new SUV(vNumber);
            default -> {
                System.out.println("Invalid choice. Defaulting to Mini.");
                vehicle = new Mini(vNumber);
            }
        }

        // Distance input
        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        IRideService ride = new RideService(vehicle, driver);
        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}
