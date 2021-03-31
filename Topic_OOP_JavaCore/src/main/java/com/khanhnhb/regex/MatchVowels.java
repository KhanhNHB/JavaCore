package com.khanhnhb.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchVowels {

    public static boolean matchConsonanceVowelConsonance(String input) {
        if (input == null || input.trim().length() == 0) {
            return false;
        }

        String regex = "[b-z&&[^ueoai]][ueoai]+[b-z&&[^ueoi]]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }

        return false;
    }
}
