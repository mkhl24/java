package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasSharedDigit(12,23);
        hasSharedDigit(9,99);
        hasSharedDigit(15,55);
        hasSharedDigit(15,18);
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {

//        System.out.println("********* testing numbers " + firstNumber + " and " + secondNumber + " *********");
        int sumOfSharedDigits = 0;
        int saveNumber = secondNumber;
        int testNumber1 = 0;
        int testNumber2 = 0;

        // conditions check
        if (((firstNumber < 10) || (firstNumber>99) || ((secondNumber < 10) || (secondNumber > 99)))) {
//            System.out.println("Invalid data");
            return false;
        }

        while (firstNumber > 0) {

            testNumber1 = firstNumber % 10; // checking least digit in firstNumber
//            System.out.println("check digit " + testNumber1);

            while(saveNumber > 0) { //secnd loop start for 2 number

                testNumber2 = saveNumber % 10; //  checking least digit in 2 number

                if (testNumber1 == testNumber2) {
                    sumOfSharedDigits++; // inc value for shared digits
                }

                saveNumber /= 10;
            }  // second loop stop for 2 number

            saveNumber = secondNumber;
            firstNumber /= 10;  // decimating firstNumber - incr
        }

        if (sumOfSharedDigits < 1) {
//            System.out.println("no same digits found");
            return false;
        } else {
//            System.out.println("equal digits was found");
            return true;
        }

    }

}
