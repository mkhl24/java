package com.mkhl24;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "bob";
////        player.health = 20;
//        player.weapon = "staff";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining  health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining  health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("bob", 200, "staff");
        System.out.println("Initial health is " + player.getHealth());

        // simulating duplex printer
        Printer duplexPrinter = new Printer(90,true);
        duplexPrinter.fillToner(14);
        duplexPrinter.fillToner(5);
        duplexPrinter.printPages(4);
        duplexPrinter.printPages(7);

        // not duplex printer
        Printer printer = new Printer(30,false);
        printer.fillToner(40);
        printer.printPages(40);

    }

}
