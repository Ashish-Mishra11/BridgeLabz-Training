package com.encapsulation.ridehailingapplication;

public class Auto extends Vehicle{
	Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.1;
    }

}
