package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        Account mkhlAccount = new Account("Mkhl");
        mkhlAccount.deposit(1000);
        mkhlAccount.withdraw(500);
        mkhlAccount.withdraw(-200);
        mkhlAccount.deposit(-50);
        mkhlAccount.calculateBalance();
        mkhlAccount.balance = 5000;

        System.out.println("Balance on account is " + mkhlAccount.getBalance());
        mkhlAccount.transactions.add(4500);
        mkhlAccount.calculateBalance();

    }
}
