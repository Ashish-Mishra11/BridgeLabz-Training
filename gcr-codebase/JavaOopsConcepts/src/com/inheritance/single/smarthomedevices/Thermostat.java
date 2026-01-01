package com.inheritance.single.smarthomedevices;

public class Thermostat  extends Device{
	 private int temperatureSetting;

	    Thermostat(String deviceId, String status, int temperatureSetting) {
	        super(deviceId, status);
	        this.temperatureSetting = temperatureSetting;
	    }

	    @Override
	    public void displayStatus() {
	        super.displayStatus();
	        System.out.println("Temperature Setting: " + temperatureSetting);
	    }

}
