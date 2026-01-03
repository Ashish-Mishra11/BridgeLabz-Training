package com.day01.smarthomeautomationsystem;
public class AC extends Appliance {

    public AC(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC is ON with cooling at 22°C ");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC is OFF");
    }
}
