package com.searching.binarysearch;
public class PeakElementBinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0}; // sample array

        int peakIndex = findPeakElement(arr);

        System.out.println("A peak element is at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // Check if mid is peak
            if (leftSmaller && rightSmaller) {
                return mid;
            }

            // If left neighbor is greater, peak is in left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } 
            // If right neighbor is greater, peak is in right half
            else {
                left = mid + 1;
            }
        }

        return -1; // should never reach here if array has at least one element
    }
}
