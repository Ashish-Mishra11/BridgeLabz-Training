package com.searching.binarysearch;
public class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int[] result = findFirstAndLast(arr, target);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);

        return new int[]{first, last};
    }

    // Helper method to find occurrence
    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1; // search left half for first occurrence
                } else {
                    left = mid + 1;  // search right half for last occurrence
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
