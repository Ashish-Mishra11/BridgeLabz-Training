package com.searching.stringbuffer;
public class StringComparison {
    public static void main(String[] args) {

        int count = 1_000_000;

        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < count; i++) {
            stringBuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            stringBuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        System.out.println("StringBuffer time: " + bufferTime + " nanoseconds");
        System.out.println("StringBuilder time: " + builderTime + " nanoseconds");
    }
}
