package com.company;

public class Horse extends Animal{

    String color;
    int hoof;
    String mane;


    public Horse(String name, int weight, String color, int hoof,
                 String mane) {
        super(name, weight);
        this.color = color;
        this.hoof = hoof;
        this.mane = mane;
    }

    @Override
    public void move() {
        System.out.println("Horse moving very much");

    }

    @Override
    public void eat() {
        System.out.println("Horse eating hay");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeping standing");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    public void carrying () {
        System.out.println("Horse pulling a wagon");
    }


}
