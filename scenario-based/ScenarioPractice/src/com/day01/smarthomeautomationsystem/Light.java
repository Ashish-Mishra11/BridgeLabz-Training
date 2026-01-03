package com.day01.smarthomeautomationsystem;
public class Light extends Appliance {

    public Light() {
        super(10); // default power usage
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light is ON with soft brightness ");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light is OFF");
    }
}
