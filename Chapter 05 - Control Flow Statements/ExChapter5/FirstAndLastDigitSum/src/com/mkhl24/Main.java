package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("5 % 10 = " + 5%10);
        System.out.println("Sum of the first and lasr digits in number " + 252 + " is " + sumFirstAndLastDigit(252));
        System.out.println("Sum of the first and lasr digits in number " + 257 + " is " + sumFirstAndLastDigit(257));
        System.out.println("Sum of the first and lasr digits in number " + 0 + " is " + sumFirstAndLastDigit(0));
        System.out.println("Sum of the first and lasr digits in number " + 5 + " is " + sumFirstAndLastDigit(5));
        System.out.println("Sum of the first and lasr digits in number " + -10 + " is " + sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;
        //System.out.println("Last digit in number is " + lastDigit);
        while (number != 0) {
            if (number / 10 == 0) {
                firstDigit = number;
                //System.out.println("First digit in number is " + firstDigit);
            }
            number /= 10;
        }
        sum = firstDigit + lastDigit;
        return sum;
    }
}
