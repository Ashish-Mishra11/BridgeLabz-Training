package com.annotations.annotationtomarkimportant;
public class Service {

    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data");
    }

    @ImportantMethod(level = "MEDIUM")
    public void updateData() {
        System.out.println("Updating data");
    }

    public void viewData() {
        System.out.println("Viewing data");
    }
}
