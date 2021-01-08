package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "D-ops";

    public String answer(String question) {

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

        Matcher largestMatcher = Pattern.compile(".*which of the following numbers is the largest: (.*)").matcher(question);
        if (largestMatcher.matches()) {
            String[] numbers = largestMatcher.group(1).trim().split(", ");
            int largest = Integer.parseInt(numbers[0]);
            for (String number : numbers) {
                if (Integer.parseInt(number) > largest) {
                    largest = Integer.parseInt(number);
                }
            }

            return String.valueOf(largest);
        }

        Matcher id_4842a480 = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);
        if (id_4842a480.matches()) {
            return String.valueOf(Integer.parseInt(id_44bdc450.group(1)) * Integer.parseInt(id_44bdc450.group(2)));
        }



        Matcher id_77fb4110 = Pattern.compile(".*which of the following numbers is both a square and a cube: (\\d+), (\\d+)").matcher(question);
        if (id_77fb4110.matches()) {
            if ((Math.sqrt(Integer.parseInt(id_77fb4110.group(1))) % 1 == 0)&&(Math.cbrt(Integer.parseInt(id_77fb4110.group(1))) % 1 == 0)){
                return id_77fb4110.group(1);
            }else if ((Math.sqrt(Integer.parseInt(id_77fb4110.group(2))) % 1 == 0)&&(Math.cbrt(Integer.parseInt(id_77fb4110.group(2))) % 1 == 0)){
                return id_77fb4110.group(2);
            }else{
                return "No da";
            }
        }

        return teamName;
    }

}