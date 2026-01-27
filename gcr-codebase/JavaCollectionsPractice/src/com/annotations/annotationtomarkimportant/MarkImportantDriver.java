package com.annotations.annotationtomarkimportant;
import java.lang.reflect.Method;

public class MarkImportantDriver {

    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod info = method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + info.level()
                );
            }
        }
    }
}
