package com.mkhl24;

public class Windows {

    private int windowsAmmount;
    private int windowSize;

    public Windows(int windowsAmmount, int windowSize) {
        this.windowsAmmount = windowsAmmount;
        this.windowSize = windowSize;
    }



    private int getWindowsAmmount() {
        return windowsAmmount;
    }

    private int getWindowSize() {
        return windowSize;
    }

    public void openWindow(int windowID, int positionID) {
        System.out.println("Window " + windowID + " is now moved to " + positionID + " position.");
    }
}
