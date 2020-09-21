package com.mkhl24;


class Car {
    private String name;
    private boolean engine;
    private int cylinderNumber;
    private int wheelsNumber;

    public Car(String name, int cylinderNumber) {
        this.name = name;
        this.engine = true;
        this.cylinderNumber = cylinderNumber;
        this.wheelsNumber = 4;
    }

    public String startEngine () {
        return getClass().getSimpleName() + ": Engine started";
    }

    public String accelerate () {
        return getClass().getSimpleName() + ": Car accelerates";
    }

    public String pushBreak() {
        return getClass().getSimpleName() + ": Car stopped";
    }

    public String getName() {
        return name;
    }



    public int getCylinderNumber() {
        return cylinderNumber;
    }

}

class Toyota extends Car {
    public Toyota() {
        super("Toyota",6);
    }

    @Override
    public String startEngine() {
        return "Toyota engine started";
    }

    @Override
    public String accelerate() {
        return "Toyota runs faster";
    }

    @Override
    public String pushBreak() {
        return "Toyota stopped";
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford",8);
    }

    @Override
    public String startEngine() {
        return "Ford engine started";
    }

    @Override
    public String accelerate() {
        return "Ford runs  really faster";
    }

    @Override
    public String pushBreak() {
        return "Ford stopped";
    }
}

class Lada extends Car {
    public Lada() {
        super("Lada", 6);
    }

    @Override
    public String startEngine() {
        return "Lada engine started";
    }

    @Override
    public String accelerate() {
        return "Lada moving a bit faster";
    }

    @Override
    public String pushBreak() {
        return "Lada stopped";
    }
}

class Movie {
    public String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot () {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws () {
        super("Jaws");
    }

    public String plot() {
        return "A shark feeds";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens sightseeing the Earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars () {
        super("Star Wars");
    }

    @Override
    public String plot () {
        return "A long time ago in a galaxy far away...";
    }
}

class ForgetableMovie extends Movie {

    public ForgetableMovie() {
        super("Forgetable");
    }

    // No plot method
}

public class Main {

    public static void main(String[] args) {
        ///
        for (int i = 1; i < 3; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + ": " + movie.getName() + "\n" +
                     "Plot: " + movie.plot() + "\n");
        }

        System.out.println("****************");


        for (int i = 1; i < 5; i++) {
            Car car = randomCar();
            System.out.println("Car # " + i + ": " + car.getName() +". " + car.startEngine() + "\n" +
                    car.accelerate() + ". And finally.. " + car.pushBreak() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgetableMovie();

//             default:
//                    return null;
        }
        return null;
    }

    public static Car randomCar () {
        int randomCar = (int) (Math.random()*3) +1;
        System.out.println("Random number generated was " + randomCar);
        switch (randomCar) {
            case 1:
                return new Toyota();

            case 2:
                return new Ford();

            case 3:
                return new Lada();
        }
        return null;
    }
}
