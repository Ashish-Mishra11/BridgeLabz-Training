package com.searching.linearsearch;
public class SearchWordInSentences {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a popular programming language",
            "Linear search is simple",
            "Data structures are important",
            "Algorithms help solve problems"
        };

        String targetWord = "important";

        String result = findSentenceContainingWord(sentences, targetWord);

        System.out.println(result);
    }

    // Method to perform linear search for the word
    public static String findSentenceContainingWord(String[] sentences, String word) {

        // Iterate through each sentence
        for (String sentence : sentences) {

            // Check if sentence contains the word
            if (sentence.contains(word)) {
                return sentence; // return first matching sentence
            }
        }

        // Word not found in any sentence
        return "Not Found";
    }
}
