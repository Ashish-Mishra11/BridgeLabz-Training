package com.searching.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamAndStringComparison {

    private static final int ITERATIONS = 1_000_000;
    private static final String TEXT = "hello ";
    private static final String FILE_PATH = "src/com/searching/io/input.txt"; // assume large file

    public static void main(String[] args) {

        // -------------------------------
        // StringBuilder vs StringBuffer
        // -------------------------------
        compareStringBuilders();

        // -------------------------------
        // FileReader vs InputStreamReader
        // -------------------------------
        compareFileReaders();
    }

    private static void compareStringBuilders() {

        // StringBuilder test
        long startBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(TEXT);
        }

        long endBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ms");

        // StringBuffer test
        long startBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(TEXT);
        }

        long endBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ms");
    }

    private static void compareFileReaders() {

        // FileReader test
        long startFileReader = System.currentTimeMillis();
        int fileReaderWordCount = countWordsUsingFileReader(FILE_PATH);
        long endFileReader = System.currentTimeMillis();

        System.out.println("FileReader Word Count: " + fileReaderWordCount);
        System.out.println("FileReader Time: " + (endFileReader - startFileReader) + " ms");

        // InputStreamReader test
        long startInputStreamReader = System.currentTimeMillis();
        int inputStreamReaderWordCount = countWordsUsingInputStreamReader(FILE_PATH);
        long endInputStreamReader = System.currentTimeMillis();

        System.out.println("InputStreamReader Word Count: " + inputStreamReaderWordCount);
        System.out.println("InputStreamReader Time: " + (endInputStreamReader - startInputStreamReader) + " ms");
    }

    private static int countWordsUsingFileReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        return count;
    }

    private static int countWordsUsingInputStreamReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        return count;
    }
}
