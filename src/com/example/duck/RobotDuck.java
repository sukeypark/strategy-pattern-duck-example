package com.example.duck;

import com.example.behavior.FlyWithEngine;
import com.example.behavior.RecordedQuack;

public class RobotDuck extends Duck {

    public RobotDuck() {
        this.toDisplay = "Robot duck";
        this.quackBehavior = new RecordedQuack();
        this.flyBehaior = new FlyWithEngine();
    }

}
