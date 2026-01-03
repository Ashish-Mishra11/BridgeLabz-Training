package com.day01.smarthomeautomationsystem;
public class SmartHomeAppDriver {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController user = new UserController();

        user.operateDevice(light);
        user.operateDevice(fan);
        user.operateDevice(ac);

    }
}
