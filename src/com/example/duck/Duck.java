package com.example.duck;

import com.example.behavior.FlyBehavior;
import com.example.behavior.QuackBehavior;

public abstract class Duck {

    protected String toDisplay = "normal duck";

    protected FlyBehavior flyBehaior;

    protected QuackBehavior quackBehavior;

    public void performFly() {
        this.flyBehaior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println(String.format("displaying %s", toDisplay));
    }

}
