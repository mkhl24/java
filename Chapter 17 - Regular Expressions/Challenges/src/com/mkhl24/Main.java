package com.mkhl24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String string1 = "I want a bike.";
        String string2 = "I want a car.";
        String string3 = "I want a ball.";

        System.out.println(string1.matches("^I want a bike."));
        System.out.println(string2.matches("^I want a bike."));
        System.out.println(string3.matches("^I want a b(ike|all)."));

        System.out.println("\n---------");

        String challenge3 = "I want a \\w+.";
        Pattern ch4Pattern = Pattern.compile(challenge3);
        Matcher ch4Matcher = ch4Pattern.matcher(string1);
        System.out.println(ch4Matcher.matches());
        ch4Matcher = ch4Pattern.matcher(string3);
        System.out.println(ch4Matcher.matches());

        String challenge4 = "Replace all blanks with underscore";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aabcccccccdddefffg";
        System.out.println(challenge5.matches("a*bc*d*ef*g"));
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        String challenge6 = "aabcccccccdddefffg";
        System.out.println(challenge6.matches("^aabcccccccdddefffg"));

        String challenge7 = "abcd.136";
        System.out.println(challenge7);
        System.out.println(challenge7.matches("[a-z]+[\\.]{1}[0-9]+"));

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern digits = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher digitMatcher = digits.matcher(challenge8);
        while(digitMatcher.find()) {
            System.out.println("Occurrence : " + digitMatcher.group(1));
        }

        System.out.println("---------------");
        String challenge9 = "abcd.135\tuvqz.7\tzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()) {
            System.out.println("Occurrence : " + matcher9.group(1));
        }

        System.out.println("---------------");
        String challenge10 = "abcd.135\tuvqz.7\tzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()) {
            System.out.println("Occurrence: start= " + matcher10.start(1) +
                    " end= " + (matcher10.end(1)-1));
        }

        System.out.println("--------------");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }

        System.out.println("--------------");
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 32}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }

    }
}
