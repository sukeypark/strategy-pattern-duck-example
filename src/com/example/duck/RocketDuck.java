package com.example.duck;

public class RocketDuck extends Duck {

    public RocketDuck() {
        this.toDisplay = "Rocket duck";
    }

    @Override
    public void quack() {
        System.out.println("I can't quack.");
    }

    @Override
    public void fly() {
        System.out.println("fly with engine.");
    }
}
