package com.example.behavior;

public class RecordedQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("play recorded quack.");
    }

}
