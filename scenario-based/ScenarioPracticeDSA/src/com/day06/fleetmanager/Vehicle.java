package com.day06.fleetmanager;
public class Vehicle {
    int id;
    int mileage;

    public Vehicle(int id, int mileage) {
        this.id = id;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + id + ", Mileage: " + mileage;
    }
}
