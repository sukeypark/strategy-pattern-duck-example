package com.example.duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.toDisplay = "Rubber duck";
    }

    @Override
    public void quack() {
        System.out.println("squeak");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }

}
