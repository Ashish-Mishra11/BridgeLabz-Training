package com.reflection.dependencyinjection;
import java.lang.reflect.Field;

class DIContainer {

    public static <T> T createObject(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(Inject.class)) {

                Class fieldType = field.getType();

                Object dependency = fieldType.getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }

        return obj;
    }
}
