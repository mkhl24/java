package com.mkhl24;


public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constuctor

    public BankAccount () {
        this("4123", 2.50, "Default name","Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount (String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber (String number) {
        this.number = number;
    }
    public String getNumber () {
        return this.number;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
    public double getBalance () {
        return this.balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName () {
        return this.customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail () {
        return this.email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void deposit (double depositAmmount) {
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + " processed. Remaining balance = " + this.balance);
    }

    public void withdraw (double withdrawalAmmount) {
        if (this.balance - withdrawalAmmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmmount;
            System.out.println("Withdrawal of " + withdrawalAmmount + " processed. Remaining balance = " + this.balance);
        }
    }
}
