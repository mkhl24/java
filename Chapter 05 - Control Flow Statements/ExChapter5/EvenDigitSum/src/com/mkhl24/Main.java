package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("1 % 10 = " + 1%10);
//        System.out.println("Sum of even digits in number " + 41 + " is " + getEvenDigitSum(41));
//        System.out.println("Sum of even digits in number " + 444 + " is " + getEvenDigitSum(444));
        System.out.println("Sum of even digits in number " + 123456789 + " is " + getEvenDigitSum(123456789));
        System.out.println("Sum of even digits in number " + 252 + " is " + getEvenDigitSum(252));
        System.out.println("Sum of even digits in number " + -22 + " is " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum (int number) {
//        System.out.println("***********NUMBER IS "+ number +"*************");
        if (number < 0) {
            return -1;
        }
        int sumEvenNumbers = 0;
        int testDigit = 0;

        while (number >= 0) {
            testDigit = number % 10;
            if (testDigit % 2 == 0) {
//                System.out.println("Even degit found - " + testDigit);
                sumEvenNumbers = sumEvenNumbers + testDigit;
            }
            if (number / 10 == 0) {
                break;
            }
            number /= 10;
//            System.out.println("the number now is " + number);

        }

        return sumEvenNumbers;
    }
}
