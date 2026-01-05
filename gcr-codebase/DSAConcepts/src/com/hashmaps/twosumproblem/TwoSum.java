package com.hashmaps.twosumproblem;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, -1 }; // no solution
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices found:");
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        } else {
            System.out.println("No valid pair found");
        }
    }
}
