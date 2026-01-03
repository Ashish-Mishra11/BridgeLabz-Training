package com.day01.smarthomeautomationsystem;
public class Fan extends Appliance {

    public Fan(int powerUsage) {
        super(powerUsage); // user-defined
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan is ON at medium speed ");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan is OFF");
    }
}
