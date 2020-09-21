package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10.25 kil is " + toMilesPerHour(10.25) + " miles");
        printConversion(24.42);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        double convertedValue = 0;
        if (kilometersPerHour < 0) {
            return -1;
        }
        convertedValue = kilometersPerHour / 1.609;
        convertedValue = Math.round(convertedValue);
        return  (long) convertedValue;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }


}
