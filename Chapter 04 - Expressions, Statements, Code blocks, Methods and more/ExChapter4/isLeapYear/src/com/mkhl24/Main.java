package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        int yt = 1924 % 40;
        System.out.println("yt = " + yt);

    }

    public static boolean isLeapYear (int year) {

        boolean reBoolean = false;

        if ((year < 1) || (year > 9999)) {
            reBoolean = false;
            System.out.println("is false");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            reBoolean = true;
            System.out.println("is true");
        } return reBoolean;
        }
    }

