package com.inheritance.hybrid.vehiclemanagement;

public class VehicleManagementSystemDriver {
	 public static void main(String[] args) {

	        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
	        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 200, 50);

	        ev.displayInfo();
	        ev.charge();
	        System.out.println();
	        pv.displayInfo();
	        pv.refuel();
	    }

}
