package com.mkhl24;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        if (n == 0) return 0;
        while (n >= 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return ((n-1)+(n-2));
        }
    }

}

// nSum(int n) returns the sum of all numbers from 0 to n.
//
// factorial(int n) returns the product of all numbers from 1 to n

//
// fibonacci(n) returns the nth Fibonacci number. These are defined as:
// f(0) = 0
// f(1) = 1
// f(n) = f(n-1) + f(n-2)
// (so f(2) is also 1. The first 10 fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.