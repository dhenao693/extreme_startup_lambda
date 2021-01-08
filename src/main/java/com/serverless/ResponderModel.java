package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "D-ops";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher id_44bdc450 = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (id_44bdc450.matches()) {
            return String.valueOf(Integer.parseInt(id_44bdc450.group(1)) + Integer.parseInt(id_44bdc450.group(2)));
        }

        Matcher largestMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+)").matcher(question);
        if (largestMatcher.matches()) {
            int largest = 0;
            String[] numbers = sumMatcher.group(1).split(", ");
            for (String number : numbers) {
                if (Integer.parseInt(number) > largest) {
                    largest = Integer.parseInt(number);
                }
            }
            return String.valueOf(largest);
        }
        return teamName;
    }

}