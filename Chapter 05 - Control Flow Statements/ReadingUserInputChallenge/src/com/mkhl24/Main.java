package com.mkhl24;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

//        while (true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine(); // handle end of line (enter key) + invalid value

        }
        System.out.println("Sum of numbers is: " + sum);
        scanner.close();

    }

}

