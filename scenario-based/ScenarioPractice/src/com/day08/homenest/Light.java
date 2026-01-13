package com.day08.homenest;
public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId);
        energyUsage = 5;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned on");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned off");
    }

    public void reset() {
        setStatus(false);
        System.out.println("Light reset");
    }
}
