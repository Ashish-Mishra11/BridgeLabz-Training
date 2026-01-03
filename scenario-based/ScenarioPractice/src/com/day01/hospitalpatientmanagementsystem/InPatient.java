package com.day01.hospitalpatientmanagementsystem;

public class InPatient extends Patient {
	private int numberOfDays;
    private double roomChargePerDay;

    public InPatient(int id, String name, int days, double charge) {
        super(id, name);
        this.numberOfDays = days;
        this.roomChargePerDay = charge;
    }

    @Override
    void displayInfo() {
        System.out.println("In-Patient: " + name);
        System.out.println("Doctor: " + assignedDoctor.getDoctorName());
    }

    public double getRoomCharges() {
        return numberOfDays * roomChargePerDay;
    }

}
