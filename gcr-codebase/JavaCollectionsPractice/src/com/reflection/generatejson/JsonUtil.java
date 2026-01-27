package com.reflection.generatejson;
import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        Class cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"");
            json.append(field.getName());
            json.append("\":");

            Object value = field.get(obj);

            if (value instanceof String) {
                json.append("\"");
                json.append(value);
                json.append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");
        return json.toString();
    }
}
