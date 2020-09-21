package com.mkhl24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE; // if not using bool flag
        int minNumber = Integer.MAX_VALUE;
        boolean first = true;

        while (true) {

            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();

                if (first) {
                    minNumber = number;
                    maxNumber = number;
                    first = false;
                }

                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }

            } else {
//                System.out.println("Failed to parse an int");

                break;
            }
            scanner.nextLine(); // handle input
        }

        System.out.println("The min number was - " + minNumber + " and the max number was " + maxNumber);
        scanner.close();
    }
}
