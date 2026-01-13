package com.day08.homenest;
public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
        energyUsage = 10;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera stopped");
    }

    public void reset() {
        System.out.println("Camera recalibrated");
    }
}
