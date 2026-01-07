package com.day05.parkease;
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        double total = baseRate * hours;
        if (hours > 5) {
            total = total + 100;
        }
        return total;
    }
}
