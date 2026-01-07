package com.day05.parkease;
public class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String bookingLog;

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
        this.bookingLog = "";
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " assigned to " + vehicle.getVehicleNumber();
        } else {
            System.out.println("Slot not available or vehicle type mismatch");
        }
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " released";
    }

    public void showLog() {
        System.out.println(bookingLog);
    }
}
