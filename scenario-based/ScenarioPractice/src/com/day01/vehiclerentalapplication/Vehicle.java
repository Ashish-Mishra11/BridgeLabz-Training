package com.day01.vehiclerentalapplication;

public abstract class Vehicle implements Rentable {
	protected int vehicleId;
    protected String brand;
    protected double baseRatePerDay;

    public Vehicle(int vehicleId, String brand, double baseRatePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRatePerDay = baseRatePerDay;
    }


    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public abstract void displayDetails();

}
