package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("55 % 0 is " + 0%5);
        System.out.println("1b + 0s and 4 goal is " + canPack(1,0,4));
        System.out.println("1b + 0s and 5 goal is " + canPack(1,0,5));
        System.out.println("0b + 5s and 4 goal is " + canPack(0,5,4));
        System.out.println("2b + 2s and 11 goal is " + canPack(2,2,11));
    }

    public static boolean canPack (int bigCount, int smalCount, int goal) {
        if ((bigCount < 0) || (smalCount < 0) ||(goal < 0)) {
            return false;
        } else if ((5*bigCount + smalCount) < goal) {
            return false;
        } else if ((goal % 5 == 0) || (goal % 5 <= smalCount)) {
            return true;
        } else {
            return false;
        }
    }
}
