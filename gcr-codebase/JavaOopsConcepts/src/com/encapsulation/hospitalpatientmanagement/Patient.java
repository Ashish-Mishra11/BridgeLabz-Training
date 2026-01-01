package com.encapsulation.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {
	private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();

    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }

    public abstract double calculateBill();

}
