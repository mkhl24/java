package com.mkhl24;

class Addition {
    private String addName;
    private int addPrice;
    private int addAmount;

    public Addition(String addName, int addPrice, int addAmount) {
        this.addName = addName;
        this.addPrice = addPrice;
        this.addAmount = 0;
    }

    public int priceAbove () {
        return getAddAmount() * getAddPrice();
    }

    public String getAddName() {
        return this.addName;
    }

    public int getAddPrice() {
        return this.addPrice;
    }

    public int getAddAmount() {
        return this.addAmount;
    }

    public void setAddAmount(int addAmount) {
        this.addAmount = addAmount;
    }
}

class Tomato extends Addition {
    public Tomato (int addAmount) {
        super("Tomato", 3, addAmount);
    }
}

class Bacon extends Addition {
    public Bacon (int addAmount) {
        super("Bacon", 4, addAmount);
    }
}

class Salad extends Addition {
    public Salad (int addAmount) {
        super("Salad", 2, addAmount);
    }
}

class FancyCheese extends Addition {
    public FancyCheese (int addAmount) {
        super("FancyCheese", 5, addAmount);
    }

class HealthyCarrot extends Addition {
    public HealthyCarrot(String addName, int addPrice, int addAmount) {
        super("HealthyCarrot", 3, addAmount);
    }
}
}

// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Hamburger {
    private String breadRoll;
    private String meat;
    private int price;
    private String name;
    int addAmount = 0;

    public Hamburger() {
        this.breadRoll = "white rounded bread";
        this.meat = "pork";
        this.price = 12;
        this.name = "Burger";
        System.out.println("Your order is <" + getName() + ">. Base price is " + this.price + "\n" +
                "Type of meet: " + getMeat() + ", served on " + getBreadRoll());
    }


    public int setAddition (int i, int number) {
        if (i>0 && i<=4 && number > 0 && addAmount+number <= 4) {
            switch (i) {
                case 1:
                    Tomato tomato = new Tomato(number);
                    System.out.println("Tomato added in number of " + number + "\n" +
                            "Addition cost is " + tomato.getAddPrice() + "\n" +
                            "New price is " + (getPrice() + number*tomato.getAddPrice()) +".");
                    return this.price += number*tomato.getAddPrice();
                case 2:
                    Bacon bacon = new Bacon(number);
                    System.out.println("Bacon added in number of " + number + "\n" +
                                    "Addition cost is " + bacon.getAddPrice() + "\n" +
                            "New price is " + (getPrice() + number*bacon.getAddPrice()) +".");
                    return this.price += number*bacon.getAddPrice();
                case 3:
                    Salad salad = new Salad(number);
                    System.out.println("Salad added in number of " + number + "\n" +
                                    "Addition cost is " + salad.getAddPrice() + "\n" +
                            "New price is " + (getPrice() + number*salad.getAddPrice()) +".");
                    return this.price += number*salad.getAddPrice();
                case 4:
                    FancyCheese cheese = new FancyCheese(number);
                    System.out.println("Cheese added in number of " + number + "\n" +
                                    "Addition cost is " + cheese.getAddPrice() + "\n" +
                            "New price is " + (getPrice() + number*cheese.getAddPrice()) +".");
                    return this.price += number*cheese.getAddPrice();
                default:
                        return -1;
            }
        } else {
            System.out.println("Order customization failed");
            return -1;
        }
    }


    public String getBreadRoll() {
        return this.breadRoll;
    }

    public String getMeat() {
        return this.meat;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
