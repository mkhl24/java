package com.mkhl24;

import java.lang.module.ModuleReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case ("2208", "Dell" , "200", dimensions);

        Monitor monitor = new Monitor("123fsa", "Acer", 27, new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("83-200", "Asus", 4 , 6, "v2.4");

        PC thePC = new PC(theCase, monitor, motherboard);

//        thePC.getMonitor().drawPixelAt(1500,900,"red");
//        thePC.getMotherboard().loadProgram("example.exe");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
        thePC.drawLogo();

    }
}
