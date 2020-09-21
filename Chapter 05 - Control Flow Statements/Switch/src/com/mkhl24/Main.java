package com.mkhl24;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int value =1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }


        int switchValue = 3;

        switch(switchValue) {  //switch statement
            case 1:
                System.out.println("Was 1");
                break;

            case 2:
                System.out.println("Was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually was " + switchValue);
                break;

            default:    // for any other case
                System.out.println("Was not 1 or 2");
                break;
        }

        //
        char switchChar = 'A';

        switch (switchChar) {
            case 'a':
                System.out.println("Was 'a'.");
                break;

            case 'b':
                System.out.println("Was 'b'.");
                break;

            case 'c':
                System.out.println("Was 'c'.");
                break;

            case 'd': case 'e':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("Literas 'a-e' wasn't printed.");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }

        // more code
    }
}
