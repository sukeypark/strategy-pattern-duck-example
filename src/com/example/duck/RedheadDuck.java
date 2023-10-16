package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class RedheadDuck extends Duck implements Quackable, Flyable {

    public RedheadDuck() {
        this.toDisplay = "Redhead Duck";
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
