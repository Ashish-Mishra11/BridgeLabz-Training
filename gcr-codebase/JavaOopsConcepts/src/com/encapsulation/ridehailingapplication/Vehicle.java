package com.encapsulation.ridehailingapplication;

public abstract class Vehicle implements GPS {
	 private String vehicleId;
	    private String driverName;
	    private double ratePerKm;
	    private String currentLocation;

	    Vehicle(String vehicleId, String driverName, double ratePerKm) {
	        this.vehicleId = vehicleId;
	        this.driverName = driverName;
	        this.ratePerKm = ratePerKm;
	    }

	    public String getVehicleId() {
	        return vehicleId;
	    }

	    public String getDriverName() {
	        return driverName;
	    }

	    protected double getRatePerKm() {
	        return ratePerKm;
	    }

	    public void getVehicleDetails() {
	        System.out.println("Vehicle ID: " + vehicleId);
	        System.out.println("Driver: " + driverName);
	        System.out.println("Rate/Km: " + ratePerKm);
	        System.out.println("Location: " + currentLocation);
	    }

	    @Override
	    public String getCurrentLocation() {
	        return currentLocation;
	    }

	    @Override
	    public void updateLocation(String location) {
	        this.currentLocation = location;
	    }

	    public abstract double calculateFare(double distance);

}
