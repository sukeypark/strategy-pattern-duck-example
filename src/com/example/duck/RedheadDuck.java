package com.example.duck;

import com.example.behavior.FlyWithWings;
import com.example.behavior.Quack;
import com.example.behavior.QuackBehavior;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.toDisplay = "Redhead Duck";
        this.quackBehavior = new Quack();
        this.flyBehaior = new FlyWithWings();
    }

}
