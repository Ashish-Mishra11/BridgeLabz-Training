package com.annotations.todoannotation;
public class ProjectService {

    @Todo(
        task = "Implement login feature",
        assignedTo = "Rahul",
        priority = "HIGH"
    )
    public void login() {
        System.out.println("Login logic pending");
    }

    @Todo(
        task = "Add validation",
        assignedTo = "Anita"
    )
    public void validateData() {
        System.out.println("Validation logic pending");
    }

    public void completedFeature() {
        System.out.println("Feature completed");
    }
}
