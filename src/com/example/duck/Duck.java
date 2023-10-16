package com.example.duck;

public abstract class Duck {

    protected String toDisplay = "normal duck";

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println(String.format("displaying %s", toDisplay));
    }

}
