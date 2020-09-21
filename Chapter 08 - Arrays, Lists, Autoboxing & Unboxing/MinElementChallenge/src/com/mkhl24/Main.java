package com.mkhl24;
/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.
 */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count of numbers in array. \r");
        int count = scanner.nextInt();
        int[] intypedArray = readIntegers(count);
        System.out.println("Minimum element of array = " + findMin(intypedArray));
    }

    public static int [] readIntegers (int number) {
        int[] values = new int[number];
        System.out.println("Input " + number + " integer numbers. \r");
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine(); // for handling enter-key pressing without any imputed number
        }
        return values;
    }

    public static int findMin (int[] values) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }


}
