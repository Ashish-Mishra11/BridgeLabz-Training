package com.day06.fleetmanager;
import java.util.Scanner;

public class FleetManagerDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of depots: ");
        int depotCount = sc.nextInt();

        Vehicle[][] depots = new Vehicle[depotCount][];

        // Input vehicles for each depot
        for (int d = 0; d < depotCount; d++) {
            System.out.print("Enter number of vehicles in depot " + (d + 1) + ": ");
            int n = sc.nextInt();
            depots[d] = new Vehicle[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Vehicle ID for vehicle " + (i + 1) + ": ");
                int id = sc.nextInt();
                System.out.print("Enter Mileage for vehicle " + (i + 1) + ": ");
                int mileage = sc.nextInt();
                depots[d][i] = new Vehicle(id, mileage);
            }
        }

        // Combine all depot vehicles into one array
        int totalVehicles = 0;
        for (Vehicle[] depot : depots) totalVehicles += depot.length;
        Vehicle[] allVehicles = new Vehicle[totalVehicles];

        int index = 0;
        for (Vehicle[] depot : depots) {
            for (Vehicle v : depot) {
                allVehicles[index++] = v;
            }
        }

        // Sort all vehicles by mileage
        allVehicles = MergeSort.mergeSort(allVehicles);

        // Print final master maintenance schedule
        System.out.println("\nMaster Maintenance Schedule:");
        for (Vehicle v : allVehicles) {
            System.out.println(v);
        }

        sc.close();
    }
}
