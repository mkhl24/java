package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount mkhlaccount = new BankAccount();
       // BankAccount mkhlaccount = new BankAccount("M1231q", 0.00, "Mikhail",
        //        "emial@m.m", "322 233 322");

        mkhlaccount.withdraw(14.5);
        mkhlaccount.deposit(1056.23d);
        mkhlaccount.withdraw(106.23d);
        mkhlaccount.withdraw(50.3d);

        BankAccount wtfaccount = new BankAccount("Tim","tim@email","123");
        System.out.println(wtfaccount.getPhoneNumber() + " name " + wtfaccount.getCustomerName());

        VipCustomer mkhl1 = new VipCustomer();
        System.out.println(mkhl1.getName() + " name, " + mkhl1.getCreditLimit() + " credit limit and " + mkhl1.getEmail() + " email");

        VipCustomer mkhl2 = new VipCustomer("Mikhail", 100_000.23d);
        System.out.println(mkhl2.getName() + " name, " + mkhl2.getCreditLimit() + " credit limit and " + mkhl2.getEmail() + " email");

        VipCustomer mkhl3 = new VipCustomer("Bob",20_000.42,"bob@email");
        System.out.println(mkhl3.getName() + " name, " + mkhl3.getCreditLimit() + " credit limit and " + mkhl3.getEmail() + " email");
    }
}
