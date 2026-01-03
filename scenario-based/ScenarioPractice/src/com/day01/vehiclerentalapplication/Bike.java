package com.day01.vehiclerentalapplication;

public class Bike extends Vehicle {
	private double helmetCharge = 50;

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRatePerDay * days) + helmetCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike: " + brand);
    }

}
