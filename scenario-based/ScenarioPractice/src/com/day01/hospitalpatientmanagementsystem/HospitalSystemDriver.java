package com.day01.hospitalpatientmanagementsystem;

public class HospitalSystemDriver {
	public static void main(String[] args) {

        Doctor doc = new Doctor(101, "Dr. Sharma", "Cardiology");

        Patient p1 = new InPatient(1, "Anuradha", 5, 2000);
        p1.assignDoctor(doc);

        Patient p2 = new OutPatient(2, "Rahul", 500);
        p2.assignDoctor(doc);

        p1.displayInfo();
        p2.displayInfo();

        Bill bill1 = new Bill(10000);
        System.out.println("Total Bill Amount: ₹" + bill1.calculatePayment());
    }

}
