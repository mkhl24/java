package com.mkhl24;

public class Main {

    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.

    public static void main(String[] args) {
	// write your code here

        RoomBlock roomBlock = new RoomBlock("livingroom",3,7,4);
        Windows windows = new Windows(4,10);
        Radio radio = new Radio("Thunderer","Volume",1000.32);

        Room testRoom = new Room(roomBlock, windows, radio);

        testRoom.haveFun();
        testRoom.changeMusic(104.5);

    }
}
