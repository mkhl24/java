package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone myPhone;
        myPhone = new DeskPhone(899999999);

        myPhone.powerOn();
        myPhone.callPhone(899999999);
        myPhone.answer();

        myPhone = new MobilePhone(23432);
        myPhone.powerOn();
        myPhone.callPhone(23432);
        myPhone.answer();

    }
}
