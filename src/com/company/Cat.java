package com.company;

public class Cat extends Animal{
    String color;
    String tail;
    String fur;
    int kittens;

    public Cat(String name, int weight, String color, String tail, String fur, int kittens) {
        super(name, weight);
        this.color = color;
        this.tail = tail;
        this.fur = fur;
        this.kittens = kittens;
    }

    @Override
    public void move() {
        System.out.println("Cat moving very fast");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping on radiator");
    }
}
