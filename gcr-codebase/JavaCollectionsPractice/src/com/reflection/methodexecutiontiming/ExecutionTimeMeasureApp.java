package com.reflection.methodexecutiontiming;
public class ExecutionTimeMeasureApp {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        ExecutionTimer.timeMethod(service, "task");
    }
}