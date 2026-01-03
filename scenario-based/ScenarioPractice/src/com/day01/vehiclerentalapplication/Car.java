package com.day01.vehiclerentalapplication;

public class Car extends Vehicle{
	private double acChargePerDay = 200;

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRatePerDay * days) + (acChargePerDay * days);
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + brand);
    }

}
