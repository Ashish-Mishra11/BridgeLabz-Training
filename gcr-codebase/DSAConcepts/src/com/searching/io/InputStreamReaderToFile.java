package com.searching.io;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderToFile {

    public static void main(String[] args) {

        String filePath = "src/com/searching/io/output.txt";

        InputStreamReader isr = null;
        BufferedReader br = null;
        FileWriter fw = null;

        try {
            // Create InputStreamReader to read from console
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            // Create FileWriter to write to file
            fw = new FileWriter(filePath, true); // append mode

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            // Read input until user types "exit"
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write input to file as new line
                fw.write(input);
                fw.write(System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (br != null)
                    br.close();
                if (isr != null)
                    isr.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println("Error closing resources");
            }
        }
    }
}
