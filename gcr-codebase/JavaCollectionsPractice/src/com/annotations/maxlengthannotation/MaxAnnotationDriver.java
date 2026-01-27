package com.annotations.maxlengthannotation;
public class MaxAnnotationDriver {

    public static void main(String[] args) {

        User user1 = new User("Anu123");
        System.out.println("User created: " + user1.getUsername());

        User user2 = new User("VeryLongUsername1");
        System.out.println("User created: " + user2.getUsername());
    }
}
