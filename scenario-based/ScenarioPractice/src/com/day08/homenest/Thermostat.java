package com.day08.homenest;
public class Thermostat extends Device {

    private int temperature;

    public Thermostat(String deviceId) {
        super(deviceId);
        energyUsage = 8;
        temperature = 24;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat on");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat off");
    }

    public void reset() {
        temperature = 24;
        System.out.println("Thermostat reset to 24");
    }
}
