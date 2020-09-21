package com.mkhl24;

// Each Branch should have an arraylist of Customers
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

import java.util.ArrayList;

public class Branch {

    final private Double initialTransaction = 100.0;
    private String brunchName;
    private ArrayList<Customer> brunchCustomers; // = new ArrayList<Customer>();

    public Branch(String brunchName) {
        this.brunchName = brunchName;
        this.brunchCustomers = new ArrayList<Customer>();
    }

    public String getBrunchName() {
        return brunchName;
    }

    public void addNewCustomer (String customerName) {
        Customer newCustomer = new Customer(customerName);
        this.brunchCustomers.add(newCustomer);
        newCustomer.getTransactions().add(initialTransaction);
        System.out.println("Branch.addNewCustomer(): New customer "+customerName+" was added, with initial transaction of " + initialTransaction);
    }

    public int findCustomer (Customer customer) {
        return brunchCustomers.indexOf(customer);
    }

//    public boolean newCustomer (String name) {
//        if (queryCustomer(name) == null) {
//            this.brunchCustomers.add(new Customer(name));
//            return true;
//        }
//        return false;
//    }

    public Customer queryCustomer (String customerName) {
        for (int i=0; i <brunchCustomers.size(); i++) {
            Customer customer = brunchCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

//    private Customer findCustomer (String customerName) {
//        for (int i=0; i<this.brunchCustomers.size(); i++) {
//            Customer checked = this.brunchCustomers.get(i);
//            if (checked.getName().equals(customerName)) {
//                return checked;
//            }
//        }
//        return null;
//    }

    public void addCustomersTransaction (Customer customer, Double amount) {
        customer.getTransactions().add(amount);
    }

    public ArrayList<Customer> getBrunchCustomers() {
        return brunchCustomers;
    }
}
