package com.searching.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        String filePath = "src/com/searching/io/input.txt"; 

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create FileReader object
            fileReader = new FileReader(filePath);

            // Wrap FileReader in BufferedReader
            bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

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
