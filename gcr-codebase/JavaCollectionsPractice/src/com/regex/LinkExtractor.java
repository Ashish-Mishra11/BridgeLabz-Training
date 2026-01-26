package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LinkExtractor {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;

        while (matcher.find()) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(matcher.group());
            first = false;
        }
    }
}
