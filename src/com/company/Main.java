package com.company;

public class Main {

    public static void main(String[] args) {
        Koala koala = new Koala("Buly", 110, "soft", "grey");
        koala.makeSound();
        koala.move();
        koala.eat();
        koala.sleep();
        Horse horse = new Horse("Bucephalus", 705, "brown", 4, "brown mane");
        horse.makeSound();
        horse.carrying();
        horse.move();
        horse.eat();
        horse.sleep();
        Cat cat = new Cat("Mashka", 4, "red", "fluffy", "soft", 5);
        cat.makeSound();
        cat.move();
        cat.eat();
        cat.sleep();
    }
}
