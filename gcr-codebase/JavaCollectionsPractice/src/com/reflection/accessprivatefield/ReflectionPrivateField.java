package com.reflection.accessprivatefield;
import java.lang.reflect.Field;

public class ReflectionPrivateField {

    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class cls = p.getClass();

        Field field = cls.getDeclaredField("age");

        field.setAccessible(true);

        field.setInt(p, 30);

        int value = field.getInt(p);

        System.out.println("Age value is");
        System.out.println(value);
    }
}
