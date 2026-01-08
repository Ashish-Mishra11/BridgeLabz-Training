package com.searching.binarysearch;
import java.util.Arrays;

public class LinearBinarySearchChallenge {

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Linear Search: Find first missing positive integer
        int missing = firstMissingPositive(arr.clone()); // clone to avoid modifying original
        System.out.println("First missing positive integer: " + missing);

        // Binary Search: Find index of target
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int index = binarySearch(sortedArr, target);
        System.out.println("Index of target " + target + " in sorted array: " + index);
    }

    // -----------------------------
    // Linear Search for First Missing Positive
    // -----------------------------
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its "correct" position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find first index i where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in correct positions
        return n + 1;
    }

    // -----------------------------
    // Binary Search for Target Index
    // -----------------------------
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }
}
