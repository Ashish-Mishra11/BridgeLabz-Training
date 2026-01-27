package com.reflection.dynamicallycreateobjects;
import java.lang.reflect.Constructor;

public class ReflectionObjectCreation {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("com.reflection.dynamicallycreateobjects.Student");

        Constructor<?> constructor = clazz.getDeclaredConstructor();

        Object obj = constructor.newInstance();

        Student student = (Student) obj;

        System.out.println(student);
    }
}