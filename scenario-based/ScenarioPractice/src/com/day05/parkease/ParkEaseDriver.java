package com.day05.parkease;
import java.util.Scanner;

public class ParkEaseDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parking slot id");
        int slotId = sc.nextInt();
        sc.nextLine();

        System.out.println("Allowed vehicle type (Car Bike Truck)");
        String allowedType = sc.nextLine();

        ParkingSlot slot = new ParkingSlot(slotId, allowedType);

        System.out.println("Enter vehicle number");
        String vehicleNumber = sc.nextLine();

        System.out.println("Select vehicle type");
        System.out.println("1 Car");
        System.out.println("2 Bike");
        System.out.println("3 Truck");
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car(vehicleNumber);
        } else if (choice == 2) {
            vehicle = new Bike(vehicleNumber);
        } else {
            vehicle = new Truck(vehicleNumber);
        }

        if (slot.isAvailable()) {
            slot.assignSlot(vehicle);
        }

        System.out.println("Enter parking duration in hours");
        int hours = sc.nextInt();

        double charges = vehicle.calculateCharges(hours);

        System.out.println("Total Parking Charges: " + charges);

        slot.showLog();
        slot.releaseSlot();
        slot.showLog();

        sc.close();
    }
}
