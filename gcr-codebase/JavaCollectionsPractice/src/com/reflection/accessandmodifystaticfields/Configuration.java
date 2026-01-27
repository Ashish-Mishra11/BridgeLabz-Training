package com.reflection.accessandmodifystaticfields;
class Configuration {

    private static String API_KEY = "OLD_KEY";

    public static void showKey() {
        System.out.println(API_KEY);
    }
}
