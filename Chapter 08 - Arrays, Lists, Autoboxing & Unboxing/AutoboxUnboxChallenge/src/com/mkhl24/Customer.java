package com.mkhl24;

// Customer:
// Name, and the ArrayList of doubles.

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions; // = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions (double amount) {
        this.transactions.add(amount);
    }
}
