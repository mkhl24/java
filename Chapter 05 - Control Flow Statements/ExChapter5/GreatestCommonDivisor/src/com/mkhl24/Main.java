package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Greatest common divisor for 25 and 15 is " + getGreatestCommonDivisor(15,25));
        System.out.println("Greatest common divisor for 12 and 30 is " + getGreatestCommonDivisor(12,30));
        System.out.println("Greatest common divisor for 9 and 18 is " + getGreatestCommonDivisor(9,18));
        System.out.println("Greatest common divisor for 81 and 153 is " + getGreatestCommonDivisor(81,153));
    }


    public static int getGreatestCommonDivisor (int first, int second) {
        int greatestDivisor = 0;
        int lesserNumber = 0;
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        if (first > second) {
            lesserNumber = second;
        } else {
            lesserNumber = first;
        }

        for(int i = 1; i < lesserNumber + 1; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }

}
