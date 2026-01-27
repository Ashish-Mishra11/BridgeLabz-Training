package com.reflection.customobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class TestMapper {

    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();

        map.put("id", 111);
        map.put("name", "Ashish");
        map.put("age", 22);

        Student s = ObjectMapperUtil.toObject(Student.class, map);

        s.display();
    }
}
