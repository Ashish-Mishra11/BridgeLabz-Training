package com.annotations.cacheresultannotations;
public class Calculator {

    @CacheResult
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
