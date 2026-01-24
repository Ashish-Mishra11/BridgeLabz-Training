package com.day09.medwarehouse;
class Medicine {
    int medicineId;
    int expiryDays;

    Medicine(int medicineId, int expiryDays) {
        this.medicineId = medicineId;
        this.expiryDays = expiryDays;
    }

    void display() {
        System.out.println("Medicine ID: " + medicineId + " Expiry in days: " + expiryDays);
    }
}
