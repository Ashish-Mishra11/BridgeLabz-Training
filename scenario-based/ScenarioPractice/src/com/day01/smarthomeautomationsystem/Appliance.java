package com.day01.smarthomeautomationsystem;
public abstract class Appliance implements Controllable {

    private boolean isOn;        // Encapsulation
    private int powerUsage;      // private internal state

    public Appliance(int powerUsage) {   // Constructor
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }
}
