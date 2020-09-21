package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasSameLastDigit(41,22,71);
        hasSameLastDigit(23,32,42);
        hasSameLastDigit(9,99,999);
    }

    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirsdNumber) {
        if (((firstNumber < 10) || (firstNumber > 1000)) || ((secondNumber < 10) || (secondNumber > 1000)) || ((thirsdNumber < 10) || (thirsdNumber > 1000))) {
//            System.out.println("Invalid data");
            return false;
        }

        if ((firstNumber % 10 != secondNumber % 10) && (firstNumber % 10 != thirsdNumber % 10) && (secondNumber % 10 != thirsdNumber % 10)) {
//            System.out.println("is false");
            return false;
        } else {
//            System.out.println("is true");
            return true;
        }
    }

    public static boolean isValid (int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        } else {
            return true;
        }
    }



}
