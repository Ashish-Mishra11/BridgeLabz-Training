package com.encapsulation.vehiclerentalsystem;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystemDriver {
	 public static void main(String[] args) {

	        List<Vehicle> vehicles = new ArrayList<>();

	        vehicles.add(new Car("CAR101", 2000, "CP1001"));
	        vehicles.add(new Bike("BIKE202", 800, "BP2002"));
	        vehicles.add(new Truck("TRK303", 5000, "TP3003"));

	        int days = 3;

	        for (Vehicle v : vehicles) {
	            double rentalCost = v.calculateRentalCost(days);
	            double insuranceCost = ((Insurable) v).calculateInsurance(days);

	            System.out.println("Vehicle Type: " + v.getType());
	            System.out.println("Rental Cost: " + rentalCost);
	            System.out.println("Insurance Cost: " + insuranceCost);
	            System.out.println();
	        }
	    }

}
