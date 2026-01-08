package com.searching.stringbuilder;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
