package com.day05.parkease;
public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 5) {
            total = total + 50;
        }
        return total;
    }
}
