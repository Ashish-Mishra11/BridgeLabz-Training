package com.day08.homenest;
public abstract class Device implements IControllable {

    private String deviceId;
    private boolean status;
    protected double energyUsage;

    protected Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        logFirmwareUpdate();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateEnergy(double hours) {
        return energyUsage * hours;
    }

    protected void logFirmwareUpdate() {
        System.out.println("Firmware updated for device " + deviceId);
    }
}
