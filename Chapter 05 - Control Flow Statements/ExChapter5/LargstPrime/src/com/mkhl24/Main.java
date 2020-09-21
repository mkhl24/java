package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime (int number) {
        int largestPrime = 0;
        if (number <= 1 ) {
            return -1;
        }
        for (largestPrime = 2; largestPrime <= number; largestPrime++) {
            if (number % largestPrime == 0) {
                number /= largestPrime;
                largestPrime--;
            }
        }
        return largestPrime;
    }
}
