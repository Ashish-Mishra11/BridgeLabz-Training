package com.annotations.jsonfieldannotations;
public class JsonFieldAnnotationDriver {

    public static void main(String[] args) {

        User user = new User("Ashish", 25, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
