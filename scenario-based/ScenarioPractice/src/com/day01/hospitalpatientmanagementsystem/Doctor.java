package com.day01.hospitalpatientmanagementsystem;

public class Doctor {
	private int doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(int id, String name, String spec) {
        doctorId = id;
        doctorName = name;
        specialization = spec;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + doctorName + " (" + specialization + ")");
    }

}
