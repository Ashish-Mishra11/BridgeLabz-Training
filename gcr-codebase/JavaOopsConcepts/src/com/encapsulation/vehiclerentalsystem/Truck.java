package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
	private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000;
    }

    @Override
    public double calculateInsurance(int days) {
        return 500 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance "+insurancePolicyNumber;
    }

}
