package com.example.duck;

import com.example.behavior.FlyNoWay;
import com.example.behavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.toDisplay = "Decoy duck";
        this.flyBehaior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

}
