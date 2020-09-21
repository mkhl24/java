package com.mkhl24;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch (/*String inOrOut*/ boolean inOrOut) {
        this.clutchIsIn = /*inOrOut.equalsIgnoreCase("in")*/ inOrOut;
    }
}
