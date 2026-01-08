package com.searching.binarysearch;
public class RotationPointBinarySearch {

    public static void main(String[] args) {

        int[] arr = { 15, 18, 2, 3, 6, 12 }; // rotated sorted array

        int rotationIndex = findRotationPoint(arr);

        System.out.println("The rotation point (smallest element) is at index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }

    // Binary search to find rotation point
    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // If array is not rotated
        if (arr[left] <= arr[right]) {
            return left;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Minimum is in right half
                left = mid + 1;
            } else {
                // Minimum is in left half including mid
                right = mid;
            }
        }

        // left == right is the index of smallest element
        return left;
    }
}
