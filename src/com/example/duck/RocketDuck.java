package com.example.duck;

import com.example.behavior.FlyWithEngine;
import com.example.behavior.RecordedQuack;

public class RocketDuck extends Duck {

    public RocketDuck() {
        this.toDisplay = "Rocket duck";
        this.flyBehaior = new FlyWithEngine();
        this.quackBehavior = new RecordedQuack();
    }
}
