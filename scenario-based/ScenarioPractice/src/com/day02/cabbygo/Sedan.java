package com.day02.cabbygo;

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan", 15);
    }

    public double calculateFare(double distance) {
        double baseFare = 80;
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}
