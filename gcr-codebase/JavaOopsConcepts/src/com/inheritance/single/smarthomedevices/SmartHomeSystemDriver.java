package com.inheritance.single.smarthomedevices;

public class SmartHomeSystemDriver {
	public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH1001", "ON", 24);
        thermostat.displayStatus();
    }

}
