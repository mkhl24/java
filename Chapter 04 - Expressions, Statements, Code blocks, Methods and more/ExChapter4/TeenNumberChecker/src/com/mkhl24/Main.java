package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasTeen(9,99,19);
        hasTeen(23,15,42);
        hasTeen(22,23,34);
    }

    public static boolean hasTeen(int fNum, int sNum, int tNum) {

        if ((fNum >= 13) && (fNum <= 19) || (sNum >= 13) && (sNum <= 19) || (tNum >= 13) && (tNum <= 19)) {
            return true;
        } else {
            return false;
        }
    }

}
