package com.day01.hospitalpatientmanagementsystem;

public abstract class Patient {
	protected int patientId;
    protected String name;
    private String medicalHistory;   // sensitive data
    protected Doctor assignedDoctor;

    // Normal admission
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    // Emergency admission (overloaded constructor)
    public Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    // Polymorphic method
    abstract void displayInfo();

}
