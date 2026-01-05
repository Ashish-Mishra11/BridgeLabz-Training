package com.hashmaps.longestconsecutivesequence;
import java.util.HashMap;

public class LongestConsecutiveSequenceHashMap {

    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, true);
        }

        // Mark non-starting numbers
        for (int num : arr) {
            if (map.containsKey(num - 1)) {
                map.put(num, false); // not the start of a sequence
            }
        }

        int maxLength = 0;

        for (int num : arr) {
            if (map.get(num)) { // is start of sequence
                int current = num;
                int length = 1;

                while (map.containsKey(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nLength of longest consecutive sequence: " 
                            + longestConsecutive(arr));
    }
}
