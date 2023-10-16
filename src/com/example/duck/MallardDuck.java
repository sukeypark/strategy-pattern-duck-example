package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class MallardDuck extends Duck implements Quackable, Flyable {

    public MallardDuck() {
        this.toDisplay = "Mallard duck";
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
