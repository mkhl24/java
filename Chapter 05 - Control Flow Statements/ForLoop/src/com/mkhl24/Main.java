package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("10.000 at 2% interest = " + calculateInterest(10_000.0, 2.0));
//        System.out.println("10.000 at 3% interest = " + calculateInterest(10_000.0, 3.0));
//        System.out.println("10.000 at 4% interest = " + calculateInterest(10_000.0, 4.0));
//        System.out.println("10.000 at 5% interest = " + calculateInterest(10_000.0, 5.0));

        for(int i = 0; i < 5; i++) {   // structure of FOR loop  for(init; termination; increment)
            System.out.println("Loop " + i + " hello");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10_000.0, i)));
        }

        System.out.println("********* down ************** ");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10_000.0, i)));
        }


        //final callenge
        int primeNumberCout = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number was found - " + i);
                primeNumberCout++;
                if (primeNumberCout >= 10) {
                    System.out.println("Exiting FOR loop");
                    break;
                }
            }
        };
    }



    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }

}
