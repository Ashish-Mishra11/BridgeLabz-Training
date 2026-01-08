package com.searching.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrence {

    public static void main(String[] args) {

        String filePath = "src/com/searching/io/input.txt";   
        String targetWord = "java";      
        int count = 0;

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create FileReader and BufferedReader
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Print final count
            System.out.println("The word '" + targetWord + "' appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
