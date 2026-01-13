package com.day02.trafficmanager;
class VehicleNode {
    String vehicleNumber;
    VehicleNode next;

    VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
