package com.csvdata.duplicaterecordcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVDuplicateDetector {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/students.csv";
        Set<Integer> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",");

                int id = Integer.parseInt(columns[0].trim());

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate record found");
                    System.out.println("Student ID : " + id);
                    System.out.println("Full Row   : " + line);
                    System.out.println("-------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format in CSV file");
            e.printStackTrace();
        }
    }
}
