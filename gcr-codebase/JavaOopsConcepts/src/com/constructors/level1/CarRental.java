package com.constructors.level1;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
        costPerDay = 1000;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000;
    }

    // Method to calculate total cost
    double totalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {

        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Ashish", "Sedan", 11);

        System.out.println("Total cost (Default): " + r1.totalCost());
        System.out.println("Total cost (Rahul): " + r2.totalCost());
    }
}
