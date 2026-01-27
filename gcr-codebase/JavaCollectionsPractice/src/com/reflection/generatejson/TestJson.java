package com.reflection.generatejson;
public class TestJson {

    public static void main(String[] args) throws Exception {

        Student s = new Student(111, "Ashish", 21);

        String json = JsonUtil.toJson(s);

        System.out.println(json);
    }
}
