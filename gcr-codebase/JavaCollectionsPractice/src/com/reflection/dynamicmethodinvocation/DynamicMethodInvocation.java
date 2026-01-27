package com.reflection.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter method name");
        String methodName = sc.nextLine();

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        Class cls = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod(methodName, int.class, int.class);

        Object result = method.invoke(obj, a, b);

        System.out.println("Result is");
        System.out.println(result);
    }
}
