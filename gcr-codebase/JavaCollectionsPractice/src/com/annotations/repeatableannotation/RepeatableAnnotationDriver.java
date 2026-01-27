package com.annotations.repeatableannotation;
import java.lang.reflect.Method;

public class RepeatableAnnotationDriver {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        Method method = service.getClass().getMethod("processTask");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
