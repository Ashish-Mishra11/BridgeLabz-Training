package com.reflection.classinformation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassMonitor {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter class name");
        System.out.println("Example like - java.lang.String");
        String className = sc.nextLine();

        Class cls = Class.forName(className);

        System.out.println("Class Name");
        System.out.println(cls.getName());

        System.out.println("Fields");
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        System.out.println("Constructors");
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName());
        }

        System.out.println("Methods");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
