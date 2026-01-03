package com.day01.vehiclerentalapplication;

public class Truck extends Vehicle{
	private double loadCharge = 1000;

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRatePerDay * days) + loadCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck: " + brand);
    }

}
