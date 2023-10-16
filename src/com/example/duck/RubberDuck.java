package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class RubberDuck extends Duck implements Quackable, Flyable {

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
