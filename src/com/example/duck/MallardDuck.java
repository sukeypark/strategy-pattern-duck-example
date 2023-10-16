package com.example.duck;

import com.example.behavior.FlyWithWings;
import com.example.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.toDisplay = "Mallard duck";
        this.quackBehavior = new Quack();
        this.flyBehaior = new FlyWithWings();
    }

}
