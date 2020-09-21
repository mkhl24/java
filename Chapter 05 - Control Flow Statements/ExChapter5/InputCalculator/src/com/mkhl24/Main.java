package com.mkhl24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void inputThenPrintSumAndAverage () {

        int sum = 0;
        long average = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                count++;
                int number = scanner.nextInt();
                sum += number;
                average = Math.round((double) sum/count);

            } else {
//                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
