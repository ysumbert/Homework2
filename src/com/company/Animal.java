package com.company;

public abstract class Animal {
    String name;
    int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void move ();
    public abstract void eat ();
    public abstract void sleep ();
    public void makeSound () {
        System.out.println("The animal makes a sound");
    }

}
