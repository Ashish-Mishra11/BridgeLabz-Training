package com.day02.cabbygo;
abstract class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;
    protected double ratePerKm;
    private double fare; // sensitive data

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    protected void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public void showVehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Capacity       : " + capacity);
    }
}
