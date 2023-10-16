package com.example.duck;

import com.example.behavior.Flyable;
import com.example.behavior.Quackable;

public class RobotDuck extends Duck implements Quackable, Flyable {

    public RobotDuck() {
        this.toDisplay = "Robot duck";
    }

    @Override
    public void quack() {
        System.out.println("play recorded duck sound.");
    }

    @Override
    public void fly() {
        System.out.println("fly with engine.");
    }

}
