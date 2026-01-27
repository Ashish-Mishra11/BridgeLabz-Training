package com.reflection.dependencyinjection;
public class TestDI {

    public static void main(String[] args) throws Exception {

        Car car = DIContainer.createObject(Car.class);

        car.drive();
    }
}
