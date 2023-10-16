package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class RocketDuck extends Duck implements Quackable, Flyable {

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
