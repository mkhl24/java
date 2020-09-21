package com.mkhl24;

public interface ITelephone {

    /*public*/ void powerOn(); // access modifier is redundant
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
