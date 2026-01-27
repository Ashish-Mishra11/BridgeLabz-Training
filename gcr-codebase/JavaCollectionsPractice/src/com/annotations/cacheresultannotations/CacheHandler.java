package com.annotations.cacheresultannotations;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {

    private Map<String, Object> cache = new HashMap<>();
    private Object target;

    public CacheHandler(Object target) {
        this.target = target;
    }

    public Object invoke(String methodName, Object... args) throws Exception {

        String key = methodName + ":" + args[0]; // simple cache key

        if (cache.containsKey(key)) {
            System.out.println("Returning cached result for " + key);
            return cache.get(key);
        }

        Method method = target.getClass().getMethod(methodName, int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {

            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }

        return method.invoke(target, args);
    }
}
