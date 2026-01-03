package com.day01.hospitalpatientmanagementsystem;

public class OutPatient extends Patient{
	private double consultationFee;

    public OutPatient(int id, String name, double fee) {
        super(id, name);
        this.consultationFee = fee;
    }

    @Override
    void displayInfo() {
        System.out.println("Out-Patient: " + name);
        System.out.println("Consultation Fee: ₹" + consultationFee);
    }

    public double getConsultationFee() {
        return consultationFee;
    }

}
