package com.example.duck;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.toDisplay = "Decoy duck";
    }

    @Override
    public void quack() {
        System.out.println("I can't quack.");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }

}
