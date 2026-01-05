package com.queues.slidingwindowmaximum;
public class SlidingWindowMaximumDriver {
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] maxValues = SlidingWindowMaximum.maxSlidingWindow(arr, k);

        System.out.print("Sliding Window Maximums: ");
        for (int val : maxValues) {
            System.out.print(val + " ");
        }
    }
}
