package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CapitalizedWordExtractor {

    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b[A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;

        while (matcher.find()) {
            String word = matcher.group();

            if (word.equals("The")) {
                continue;
            }

            if (!first) {
                System.out.print(", ");
            }

            System.out.print(word);
            first = false;
        }
    }
}
