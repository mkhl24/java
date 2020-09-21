package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Create a for statement using a range of numbers from 1 to 1000 inclusive.

                Sum all the numbers that can be divided with both 3 and also with 5.

        For those numbers that met the above conditions, print out the number.

        break out of the loop once you find 5 numbers that met the above conditions.

        After breaking out of the loop print the sum of the numbers that met the above conditions.
                Note: Type all code in main method
*/
        int sumOfNumbers = 0;
        int numberCount = 0;

        for(int i=1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i + " was found.");
                numberCount++;
                sumOfNumbers += i;

            }

            if (numberCount >= 5) {
                System.out.println("Exiting loop");
                break;
            }

        }

        System.out.println("The sum of found numbers is - " + sumOfNumbers);

    }
}
