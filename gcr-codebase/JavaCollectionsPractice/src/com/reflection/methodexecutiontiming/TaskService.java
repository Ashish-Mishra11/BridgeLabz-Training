package com.reflection.methodexecutiontiming;

public class TaskService {

    public void task() {
        for (int i = 0; i < 1_000_000; i++);
    }
}