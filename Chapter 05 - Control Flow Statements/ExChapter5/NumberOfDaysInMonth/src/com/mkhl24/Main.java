package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isLeapYear(2018);
        isLeapYear(2020);
    }

    public static boolean isLeapYear (int year) {

        boolean reBoolean = false;

        if ((year < 1) || (year > 9999)) {
            reBoolean = false;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            reBoolean = true;
        } else if (year % 400 == 0) {
            reBoolean = true;
        }
        return reBoolean;
    }


    public static int getDaysInMonth (int month, int year) {
        if (((year < 1) || (year > 9999)) || ((month < 1) || (month > 12))) {
            return -1;
        }

        switch (month) {
            case 1:
                return 31;

            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return -1;
        }

    }

}
