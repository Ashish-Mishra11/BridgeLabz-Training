package com.searching.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadFileUsingInputStreamReader {

    public static void main(String[] args) {

        String filePath = "src/com/searching/io/input.txt"; 

        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create FileInputStream to read binary data
            fileInputStream = new FileInputStream(filePath);

            // Convert byte stream to character stream using UTF-8 encoding
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            // Wrap InputStreamReader with BufferedReader
            bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Close all resources
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (inputStreamReader != null)
                    inputStreamReader.close();
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error closing resources");
            }
        }
    }
}
