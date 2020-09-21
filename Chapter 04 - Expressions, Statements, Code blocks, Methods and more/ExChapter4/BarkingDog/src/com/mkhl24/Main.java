package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        bark(true, 1);
        bark(false,2);
        bark(true, 8);
        bark(true, -1);
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        boolean reBoolean = false;

        if (hourOfDay < 0 || hourOfDay > 23) {
            reBoolean = false;
        } else if ((barking == true) && (hourOfDay < 8)) {
            reBoolean = true;
        } else if ((barking == true) && (hourOfDay > 22)) {
            reBoolean = true;<
        } else {
            reBoolean = false;
        }
        return reBoolean;

    }
}
