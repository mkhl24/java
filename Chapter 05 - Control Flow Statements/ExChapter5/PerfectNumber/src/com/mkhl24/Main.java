package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("the number 6 is " + isPerfectNumber(6));
    }

    public static boolean isPerfectNumber (int number){
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("perfect");
            return true;
        } else {
            System.out.println("not perfect");
            return false;
        }

    }
}
