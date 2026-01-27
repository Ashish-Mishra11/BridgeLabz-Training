package com.annotations.loggingmethodannotation;
public class PerformanceService {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 100000; i++) {
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 10000000; i++) {
        }
    }
}
