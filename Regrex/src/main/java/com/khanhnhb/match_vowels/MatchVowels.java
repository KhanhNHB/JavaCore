package com.khanhnhb.match_vowels;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input string: ");
        String str = sc.nextLine();

        String regex = "[ueoaiUEOAI]";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println("This input string contains vowels");
        } else {
            System.out.println("This input string not contains vowels");
        }
    }
}
