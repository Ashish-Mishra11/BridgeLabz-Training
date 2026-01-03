package com.day02.cabbygo;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private String location = "Hidden"; // sensitive data

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void bookRide(double distance) {
        vehicle.showVehicleDetails();
        System.out.println("Driver Name    : " + driver.getName());
        System.out.println("Driver Rating  : " + driver.getRating());

        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Estimated Fare : " + fare);
    }

    public void endRide() {
        System.out.println("Ride Ended.");
        System.out.println("Final Fare     : " + vehicle.getFare());
    }
}
