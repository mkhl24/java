package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // public static final double PI = 3.141_59d;

    public static double area (double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        return radius * radius * 3.141_59d;
    }

    public static double area (double x, double y) {
        if ((x < 0.0) || (y < 0.0)) {
            return -1.0;
        }
        return x * y;
    }
}
