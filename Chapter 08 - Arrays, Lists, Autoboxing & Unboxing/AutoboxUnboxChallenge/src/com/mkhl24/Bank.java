package com.mkhl24;
// There should be a Bank class
// It should have an arraylist of Branches
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);


    private ArrayList<Branch> bankBranches = new ArrayList<Branch>();

    public void addNewBranch () {
        System.out.print("Enter new branch name: ");
        String branchName = scanner.nextLine();
        bankBranches.add(new Branch(branchName));
        System.out.println("Bank.addNewBranch(): New branch "+branchName+" added");
    }

    public void addBranchCustomer () {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter brunch name to add: ");
        Branch branch = findBranch(scanner.nextLine());
        if (branch != null) {
            branch.addNewCustomer(customerName);
//            System.out.println("Customer "+customerName+" has been added to branch" );
        } else {
            System.out.println("Failed to add customer: No branch found");
        }
    }


    private Branch findBranch (String branchName) {
        for(int i=0; i<this.bankBranches.size();i++) {
            Branch branch = this.bankBranches.get(i);
            if (branch.getBrunchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public void addTransaction () {
        System.out.print("Enter branch name: ");
        Branch branch = findBranch(scanner.nextLine());
        if (branch != null) {
            System.out.print("Enter customer name: ");
            Customer customer = branch.queryCustomer(scanner.nextLine());
            if (customer != null) {
                System.out.print("Enter transaction amount: ");
                Double amount = scanner.nextDouble();
                scanner.nextLine();
                branch.addCustomersTransaction(customer, amount);
                System.out.println("Bank.addTransaction() succeed: customer '" +customer.getName()+ "' of branch '" + branch.getBrunchName()+
                        "' has bew transaction with " +amount+ " amount.");
            } else {
                System.out.println("Error in Bank.addTransaction(): no such customer found");
            }
        } else {
            System.out.println("Error in Bank.addTransaction(): no branch found.");
        }
    }

    public void printCustomersList () {
        System.out.print("Enter branch name to print the list: ");
        Branch branch = findBranch(scanner.nextLine());
        if (branch != null) {
            System.out.print("Print list of transactions? y/n ");
            String keyLine = scanner.nextLine();
            char key = keyLine.charAt(0);
            switch (key) {
                case 'y':
                    for (int i=0; i< branch.getBrunchCustomers().size(); i++) {
                        System.out.println((i+1) +": " + branch.getBrunchCustomers().get(i).getName());
                        printCustomersTransactions(branch.getBrunchCustomers().get(i));
                    }
                    break;
                case 'n':
                    for (int i=0; i< branch.getBrunchCustomers().size(); i++) {
                        System.out.println((i+1) +": " + branch.getBrunchCustomers().get(i).getName());
                    }
                    break;
            }
        }
    }

    private void printCustomersTransactions (Customer customer) {
        for (int i=0; i < customer.getTransactions().size() ;i++) {
            System.out.println((i+1)+" transaction: " + customer.getTransactions().get(i));
        }
    }

}
