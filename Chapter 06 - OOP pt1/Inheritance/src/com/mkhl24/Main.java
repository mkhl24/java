package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorky",8,20,2,4,1,30,"long silky");
//        dog.eat();
        System.out.println("*********************");
        dog.walk();
//        dog.run();
    }
}

