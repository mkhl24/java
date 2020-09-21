package com.mkhl24;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void drawLogo () {
        //fancy graph
//        getMonitor().drawPixelAt(1200,50,"yellow");
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp () {
//        getTheCase().pressPowerButton();
        theCase.pressPowerButton();
    }

}
