package com.mkhl24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes I am";
        System.out.println(string);

        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        // starts with - ^***
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YyY"));
        String secondString = "abcDeeeabcDeeeF12Ghhiiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YyY"));

        // requires whole string to match
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiijkl99z"));

        // ends with - ***$
        System.out.println(alphanumeric.replaceAll("kl99z$", "THE END"));

        // replaces each individual letter
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "REPLACED"));

        // replaced [] followed by []
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "REPLACED"));

        // ignoring upper and lower case
        System.out.println("harry Harry".replaceAll("[Hh]arry", "Harry"));

        // replacing everything except [^**] . caret(^) must be inside square brackets
        String newAlphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));

        // replacing range. key sensitive
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]","X"));

        // replacement with capital letters - (?i) - works with ACSII-strings. (?iu) for Unicode
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));

        // replacing all digits and nondigits
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        // trimming all whitespaces
        String hasWhitespace = "I have a blanks adn \t a tab and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        // replace tab only
        System.out.println(hasWhitespace.replaceAll("\t", ""));
        // replace non-whitespaces
        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        //replaces a-z, A-Z, 0-9
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));

        // replaces word boundry
        System.out.println(hasWhitespace.replaceAll("\\b","X"));


        /* ----Quantifiers---- */
        String thirdAlphanumericString = "abcDeeeF12Ghhiiiiijkl99z";
//        String thirdAlphanumericString = "abcDF12Ghhiiiiijkl99z";
        // {*} - number of proceeding characters
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YyY"));
        // no matter how many char - one or more *+
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YyY"));
        // followed by 0 or more *
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YyY"));
        // specify number of occurrences
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}","YyY"));

        // replace all occurrences of h followed by any number of i and at least one j
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j","Y"));



        System.out.println("------------------------");

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>"; // anything before and after <h2>
        Pattern pattern = Pattern.compile(h2Pattern);
//        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // for case sensivity
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int counter = 0;
        while(matcher.find()) {
            counter++;
            System.out.println("Occurrence " + counter + " : " + matcher.start() + " to " + matcher.end());
        }

//        String h2GroupPattern = "(<h2>.*</h2>)";  // greedy quantifier
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();
        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGropus = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGropus);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurance : " + h2TextMatcher.group(2));
        }

        System.out.println("\n---------------\n");

        // logical OR
        System.out.println("harry Harry".replaceAll("[H|h]arry","Larry"));

        // logical NOT - [^abc] ,
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        counter = 0;
        while(tNotVMatcher.find()) {
            counter++;
            System.out.println("Occurrence " + counter + " : " +
                    tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }


        System.out.println("\n-----------------");

//         phoneTest = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";

        String phone1 = "1234567890";
        String phone2 = "(123) 456-7892";
        String phone3 = "123 456-8764";
        String phone4 = "(123)123-123";

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        System.out.println("\n-------------");
        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444";
        String visa2 = "5444444444444";
        String visa3 = "4444444444444444";
        String visa4 = "4444";

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
