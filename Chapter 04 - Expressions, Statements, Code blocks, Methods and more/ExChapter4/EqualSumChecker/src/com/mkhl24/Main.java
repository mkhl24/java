package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hasEqualSum(1, 1, 1);
        hasEqualSum(1,1,2);
        hasEqualSum(-1,1,0);
    }

    public static boolean hasEqualSum (int firstNum, int secondNum, int sumCheck){
        if (firstNum + secondNum == sumCheck) {
            System.out.println("is true");
            return true;
        } else {
            System.out.println("is false");
            return false;
        }
    }

}
