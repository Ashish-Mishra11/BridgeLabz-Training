package com.searching.stringbuffer;
public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "robust"};

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            buffer.append(words[i]);
        }

        String result = buffer.toString();
        System.out.println(result);
    }
}
