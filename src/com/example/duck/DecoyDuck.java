package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class DecoyDuck extends Duck implements Quackable, Flyable {

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
