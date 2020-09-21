package com.mkhl24;

public class Room {

    private RoomBlock roomBlock;
    private Windows windows;
    private Radio radio;

    public Room(RoomBlock roomBlock, Windows windows, Radio radio) {
        this.roomBlock = roomBlock;
        this.windows = windows;
        this.radio = radio;
    }

    public void ventelateRoom () {
        windows.openWindow(2,30);
        System.out.println("Air flow has been changed");
    }

    public void haveFun () {
        radio.activateRadio();
        System.out.println("Music is good");
    }
    public void changeMusic (double rate) {
        radio.changeRadioVave(rate);
    }
}
