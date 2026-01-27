package com.reflection.invokeprivatemethod;
import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) throws Exception {

        Calculator cal = new Calculator();

        Class cls = cal.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        Object result = method.invoke(cal, 5, 4);

        System.out.println("Result is");
        System.out.println(result);
    }
}
