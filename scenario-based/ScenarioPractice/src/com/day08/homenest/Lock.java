package com.day08.homenest;
public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
        energyUsage = 2;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Door locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    public void reset() {
        System.out.println("Lock rebooted");
    }
}
