package com.day01.vehiclerentalapplication;

public class Customer {
	private int customerId;
    private String customerName;

    public Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        vehicle.displayDetails();
        System.out.println("Rented by: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: ₹" + vehicle.calculateRent(days));
    }

}
