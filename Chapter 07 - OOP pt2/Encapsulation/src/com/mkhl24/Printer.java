package com.mkhl24;

public class Printer {
    private int tonerLevel;
    private int pagesNumber;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesNumber = 0;
        this.isDuplex = isDuplex;
    }

    // simulates toner filling
    public int fillToner (int toner) {
        if (toner > 0 && toner <= 100) {
            int fillLevel = this.tonerLevel + toner;
            if (fillLevel > 100) {
                return -1;
                System.out.println("Toner overfilled. Current toner level is " + getTonerLevel());
            } else {
                this.tonerLevel += toner;
                System.out.println("Toner filled successfull. Current toner level is " + getTonerLevel());
            }
        } else {
            return -1;
        }
    }

    // simulates printing pages
    public int printPages (int pages) {
        if (!this.isDuplex) {
            this.pagesNumber += pages;
            System.out.println("Current printed pages number is " + getPagesNumber());
            return this.pagesNumber;
        } else {
            this.pagesNumber += (pages / 2 + pages % 2);
            System.out.println("Current printed pages number is " + getPagesNumber());
            return this.pagesNumber;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }


}
