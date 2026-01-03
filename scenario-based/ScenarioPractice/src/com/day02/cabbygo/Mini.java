package com.day02.cabbygo;

class Mini extends Vehicle {
    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini", 10);
    }

    public double calculateFare(double distance) {
        double baseFare = 50;
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}
