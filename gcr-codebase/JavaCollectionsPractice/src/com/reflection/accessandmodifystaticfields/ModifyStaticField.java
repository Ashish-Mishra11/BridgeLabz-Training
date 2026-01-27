package com.reflection.accessandmodifystaticfields;
import java.lang.reflect.Field;

public class ModifyStaticField {

    public static void main(String[] args) throws Exception {

        Class cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");

        field.setAccessible(true);

        field.set(null, "NEW_API_KEY_123");

        System.out.println("Updated API Key is");
        Configuration.showKey();
    }
}
