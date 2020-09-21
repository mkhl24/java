package com.mkhl24;

public class Main {


//    Write a method with the name sumDigits that has one int parameter called number.
//
//    If parameter is >= 10 then the method should process the number and return sum of all digits,
//    otherwise return -1 to indicate an invalid value.
//
//    The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers,
//    so also return -1 for negative numbers.
//
//    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//    Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//    Add some code to the main method to test out the sumDigits method to determine that it is working correctly
//    for valid and invalid values passed as arguments.


    public static void main(String[] args) {
	// write your code here
        int someRandomNumber = 123;
        System.out.println("basic number is " + someRandomNumber);
        System.out.println("divide by 10 result for " + someRandomNumber + " is - " + someRandomNumber/10);
        System.out.println("reminder by 10 for " + someRandomNumber + " is - " + someRandomNumber%10);

        System.out.println("***********method test below************");
        sumDigits(-123);
        sumDigits(5);
        sumDigits(12);
        sumDigits(123);

    }

    public static int sumDigits (int number) {
        int sumOfDuguts = 0;
        if (number < 10) {
            System.out.println("Invalid value");
            return -1;
        }

        System.out.println("inputed number is - " + number);
        while (number % 10 != 0) {   //  (number > 0) will do
            sumOfDuguts += number % 10;
            number /= 10;
        }
        System.out.println("Sum of all digits in number is - " + sumOfDuguts);
        return sumOfDuguts;
    }

    /*
    Tim B method block

    int sum = 0;

    while (number > 0) {
        // extract the lest-segnificant digit
        int digit = number % 10;
        sum += digit;

        // drop the least-segn digit
        number /= 10;  // same as number = number / 10
    }

     */

}
