package com.mkhl24;

import java.lang.invoke.LambdaMetafactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private Lock lock;

    public BankAccount(String id, double deposit) {
        this.accountNumber = id;
        this.balance = deposit;
        this.lock = new ReentrantLock();
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }

//    public void deposit(double amount) {
//        synchronized (this) {
//            balance += amount;
//        }
//    }

//    //lock instead of synch
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//        } finally {
//            lock.unlock();
//        }
//    }

    public void deposit(double amount) {
        boolean status = false; // local = threadsafe
        try {
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get the lock");
            }
            balance += amount;
        } catch (InterruptedException e) {
            // dooo
        }

        System.out.println("Transaction status = " + status);
    }

//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

//    public  void withdraw(double amount) {
//        synchronized (this) {
//            balance -= amount;
//        }
//    }

//    //lock instead of synch
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//        } finally {
//            lock.unlock();
//        }
//    }

    public void withdraw(double amount) {
        boolean status = false; // local = threadsafe
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }

            } else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            //doooo
        }
        System.out.println("Transaction status = " + status);
    }

    // no need to synch - method only read the number
    public String getAccountNumber() {
        return accountNumber;
    }

    // no need to synch - method only read the number
    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }
}
