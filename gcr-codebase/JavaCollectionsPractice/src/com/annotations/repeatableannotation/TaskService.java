package com.annotations.repeatableannotation;
public class TaskService {

    @BugReport(description = "Null pointer exception occurs")
    @BugReport(description = "Performance issue under heavy load")
    public void processTask() {
        System.out.println("Processing task");
    }
}
