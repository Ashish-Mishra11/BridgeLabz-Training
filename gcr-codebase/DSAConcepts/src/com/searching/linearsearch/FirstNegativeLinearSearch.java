package com.searching.linearsearch;
public class FirstNegativeLinearSearch {

    public static void main(String[] args) {

        int[] arr = { 5, 8, 3, -2, 7, -9 };

        int index = findFirstNegative(arr);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }

    // Method to perform linear search
    public static int findFirstNegative(int[] arr) {

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {

            // Check if element is negative
            if (arr[i] < 0) {
                return i; // return index of first negative number
            }
        }

        // No negative number found
        return -1;
    }
}
