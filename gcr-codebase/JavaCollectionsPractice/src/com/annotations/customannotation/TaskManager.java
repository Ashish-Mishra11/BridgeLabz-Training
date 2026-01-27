package com.annotations.customannotation;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Anuradha")
    public void completeTask() {
        System.out.println("Task is being completed");
    }
}
