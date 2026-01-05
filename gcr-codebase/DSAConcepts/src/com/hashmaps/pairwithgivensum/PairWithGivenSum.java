package com.hashmaps.pairwithgivensum;
import java.util.HashMap;

public class PairWithGivenSum {

    public static void findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                System.out.println("Pair found");
                System.out.println("Elements are: " + required + " and " + arr[i]);
                return;
            }
            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTarget sum: " + target);
        findPair(arr, target);
    }
}
