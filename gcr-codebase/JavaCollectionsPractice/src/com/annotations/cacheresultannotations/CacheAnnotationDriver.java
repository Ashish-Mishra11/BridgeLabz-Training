package com.annotations.cacheresultannotations;
public class CacheAnnotationDriver {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();
        CacheHandler handler = new CacheHandler(calculator);

        System.out.println("Fibonacci 10: " + handler.invoke("fibonacci", 10));
        System.out.println("Fibonacci 10: " + handler.invoke("fibonacci", 10));
        System.out.println("Fibonacci 8: " + handler.invoke("fibonacci", 8));
        System.out.println("Fibonacci 8: " + handler.invoke("fibonacci", 8));
    }
}
