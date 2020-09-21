package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(100);
//        System.out.println("number of digits in 123 is " + getDigitCount(123));
//        System.out.println("reversed number for 123 is " + reverse(123));
    }

    public static void numberToWords (int number) {
        int digits = getDigitCount(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        number = reverse(number);
        for (int i = 0; i < digits; i++) {
            int digit = number % 10;
            number /= 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

    public static int reverse (int number) {
        int reverseNumber = number % 10;
        number /= 10;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount (int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        count++;
        number /= 10;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
