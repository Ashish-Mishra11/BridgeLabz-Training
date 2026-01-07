package com.day05.parkease;
public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 5) {
            total = total + 200;
        }
        return total;
    }
}
