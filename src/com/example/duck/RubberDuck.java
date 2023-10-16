package com.example.duck;

import com.example.behavior.FlyNoWay;
import com.example.behavior.QuackBehavior;
import com.example.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.toDisplay = "Rubber duck";
        this.flyBehaior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

}
