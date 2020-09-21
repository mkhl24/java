package com.mkhl24;

// You job is to create a simple banking application.
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.Scanner;

public class Main {

    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bank myBank = new Bank();
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.print("Enter option key. ");
            choice = myScanner.nextInt();
            myScanner.nextLine();

            switch (choice) {
                case 1:
                    myBank.addNewBranch();
                    break;
                case 2:
                    myBank.addBranchCustomer();
                    break;
                case 3:
                    myBank.addTransaction();
                    break;
                case 4:
                    myBank.printCustomersList();
                    break;
                case 5:
                    printInstructions();
                    break;
                case 6:
                    System.out.println("Exiting app.");
                    quit = true;
            }

        }


    }

    public static void printInstructions () {
        System.out.print("Instruction list\n");
        System.out.print("1: Add new branch.\n");
        System.out.print("2: Add new customer.\n");
        System.out.print("3: Add new transaction for a customer.\n");
        System.out.print("4: Print list of customers for a branch.\n");
        System.out.print("5: Print instructions.\n");
        System.out.print("6: Exit.\n");
    }



//    public void addTransaction (String branchName, String customerName, double transactionAmmount) {
//        System.out.print("Enter branch name ");
//        branchName = scanner.nextLine();
//        System.out.print("Enter");
//
//    }

//    public void addBranch (Bank bank) {
//        System.out.print("Enter new branch name: ");
//        String branchName = scanner.nextLine();
//        bank.addNewBranch(branchName);
//    }

}
