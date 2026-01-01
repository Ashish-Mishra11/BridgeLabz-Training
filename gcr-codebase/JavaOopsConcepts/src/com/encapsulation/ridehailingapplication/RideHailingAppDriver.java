package com.encapsulation.ridehailingapplication;
import java.util.ArrayList;
import java.util.List;

public class RideHailingAppDriver {
	public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        Vehicle v1 = new Car("C101", "Ramesh", 15);
        Vehicle v2 = new Bike("B202", "Suresh", 8);
        Vehicle v3 = new Auto("A303", "Mahesh", 10);

        v1.updateLocation("MG Road");
        v2.updateLocation("Station");
        v3.updateLocation("Mall");

        rides.add(v1);
        rides.add(v2);
        rides.add(v3);

        calculateFares(rides, 10);
    }

    private static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }

}
