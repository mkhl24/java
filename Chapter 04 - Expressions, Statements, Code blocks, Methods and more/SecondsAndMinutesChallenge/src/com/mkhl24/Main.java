package com.mkhl24;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invlid value"; // upper case for CONST values

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(1,63));
        System.out.println(getDurationString(63,23));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(70));
        System.out.println(getDurationString(3671));
    }

    private static String getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds > 59) || (seconds < 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutesToHours = minutes / 60;
        int minutesLeft = minutes % 60;
        //String durationString = minutesToHours + "h " + minutesLeft + "m " + seconds + "s";
        //return minutesToHours + "h " + minutesLeft + "m " + seconds + "s";

        String hoursString = minutesToHours + "h ";
        if (minutesToHours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutesLeft + "m ";
        if (minutesLeft < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = minutesToHours + "s";
        if (minutesToHours < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int secondsToMintures = seconds / 60;
        int secondsLeft = seconds % 60;
        return getDurationString(secondsToMintures, secondsLeft);
    }

}
