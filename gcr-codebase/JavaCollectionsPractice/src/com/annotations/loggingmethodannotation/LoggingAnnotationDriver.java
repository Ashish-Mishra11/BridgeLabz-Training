package com.annotations.loggingmethodannotation;
import java.lang.reflect.Method;

public class LoggingAnnotationDriver {

    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();

        Method[] methods = service.getClass().getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();

                method.invoke(service);

                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println(
                    "Method: " + method.getName() +
                    " | Execution Time (ns): " + executionTime
                );
            }
        }
    }
}
