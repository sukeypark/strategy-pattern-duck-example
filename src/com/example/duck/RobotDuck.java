package com.example.duck;

public class RobotDuck extends Duck {

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
