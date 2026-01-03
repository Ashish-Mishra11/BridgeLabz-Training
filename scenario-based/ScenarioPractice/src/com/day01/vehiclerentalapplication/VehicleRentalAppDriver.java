package com.day01.vehiclerentalapplication;

public class VehicleRentalAppDriver {
	public static void main(String[] args) {

        Customer c1 = new Customer(1, "Anuradha");

        Vehicle bike = new Bike(101, "Yamaha", 300);
        Vehicle car = new Car(102, "Honda City", 1500);
        Vehicle truck = new Truck(103, "Tata", 2500);

        c1.rentVehicle(bike, 2);
        System.out.println();

        c1.rentVehicle(car, 3);
        System.out.println();

        c1.rentVehicle(truck, 1);
    }

}
