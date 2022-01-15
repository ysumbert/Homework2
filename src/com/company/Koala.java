package com.company;

public class Koala extends Animal{
    String fur;
    String color;


    public Koala(String name, int weight, String fur, String color) {
        super(name, weight);
        this.fur = fur;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Koala moving very slow");

    }

    @Override
    public void eat() {
        System.out.println("Koala eating leaves");
    }

    @Override
    public void sleep() {
        System.out.println("Koala sleeps a lot");
    }
}
