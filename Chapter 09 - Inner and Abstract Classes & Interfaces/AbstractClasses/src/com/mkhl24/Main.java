package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Australian ");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
