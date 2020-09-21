package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesToYears = minutes / (60 * 24 * 365);
            long minutesLeft = minutes % (60 * 24 * 365);
            long minutesToDays = minutesLeft / (60 * 24);
            System.out.println(minutes + " min = " + minutesToYears + " y and "
                    + minutesToDays + " d");
        }
    }
}
