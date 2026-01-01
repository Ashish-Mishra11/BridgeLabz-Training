package com.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient {
	private double consultationFee;

    OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

}
