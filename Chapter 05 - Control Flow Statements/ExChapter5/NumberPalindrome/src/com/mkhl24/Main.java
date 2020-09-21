package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isPalindrome(101);
    }

    public static boolean isPalindrome (int number) {
        int i = number;
        int reverse = 0;
        while (i != 0) {
            reverse = reverse * 10 + (i % 10);
           // System.out.println("test number is " + reverse);
            i /= 10;
           // System.out.println("more to test - " + i);
        }

        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}
