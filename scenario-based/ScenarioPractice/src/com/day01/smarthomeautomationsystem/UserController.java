package com.day01.smarthomeautomationsystem;
public class UserController {

    public void operateDevice(Controllable device) {
        device.turnOn(); // Polymorphism
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both appliances consume equal power");
        }
    }
}
