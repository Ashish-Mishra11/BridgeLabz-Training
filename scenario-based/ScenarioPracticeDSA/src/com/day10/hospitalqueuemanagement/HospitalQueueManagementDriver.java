package com.day10.hospitalqueuemanagement;

import java.time.LocalDateTime;

public class HospitalQueueManagementDriver {
    public static void main(String[] args) {
        HospitalQueueAVL queue = new HospitalQueueAVL();

        queue.registerPatient(1, "Ashish",
                LocalDateTime.of(2026, 1, 26, 9, 15));

        queue.registerPatient(2, "Ankit",
                LocalDateTime.of(2026, 1, 26, 9, 5));

        queue.registerPatient(3, "Sumit",
                LocalDateTime.of(2026, 1, 26, 9, 30));

        queue.dischargePatient(2);

        for (Patient p : queue.displayByArrival())
            System.out.println(p);
    }
}