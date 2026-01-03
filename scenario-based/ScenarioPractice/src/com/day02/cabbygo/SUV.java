package com.day02.cabbygo;
class SUV extends Vehicle {
    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV", 20);
    }

    public double calculateFare(double distance) {
        double baseFare = 100;
        double totalFare = baseFare + distance * ratePerKm;
        setFare(totalFare);
        return totalFare;
    }
}
