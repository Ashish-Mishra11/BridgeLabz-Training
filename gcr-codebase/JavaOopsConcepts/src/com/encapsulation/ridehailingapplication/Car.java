package com.encapsulation.ridehailingapplication;

public class Car extends Vehicle {
	Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2;
    }

}
