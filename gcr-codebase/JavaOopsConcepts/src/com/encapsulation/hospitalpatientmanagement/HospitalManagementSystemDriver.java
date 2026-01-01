package com.encapsulation.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystemDriver {
	public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient("P101", "Anita", 45, 5, 3000);
        Patient p2 = new OutPatient("P102", "Rahul", 30, 800);

        p1.addRecord("Admitted for surgery");
        p2.addRecord("General consultation");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());
            System.out.println("Medical Records:");
            patient.viewRecords();
            System.out.println();
        }
    }

}
