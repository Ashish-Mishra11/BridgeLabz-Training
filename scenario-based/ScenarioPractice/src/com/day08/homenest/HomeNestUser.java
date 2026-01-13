package com.day08.homenest;
public class HomeNestUser {

    private Device[] devices;
    private int count;

    public HomeNestUser(int size) {
        devices = new Device[size];
        count = 0;
    }

    public void addDevice(Device device) {
        devices[count] = device;
        count++;
        System.out.println("Device registered");
    }

    public Device getDevice(int index) {
        return devices[index];
    }

    public int getCount() {
        return count;
    }
}
