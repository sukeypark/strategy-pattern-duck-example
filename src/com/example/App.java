package com.example;

import com.example.behavior.FlyNoWay;
import com.example.behavior.FlyWithWings;
import com.example.behavior.MuteQuack;
import com.example.behavior.Quack;
import com.example.duck.Duck;
import com.example.duck.MallardDuck;

public class App {
    public static void main(String[] args) throws Exception {
        // Some Mallar ducks can quack after it becomes 3 years old.
        // Some Mallar ducks can fly after it becomes 5 years old.

        Duck mallarDuck = new MallardDuck();
        mallarDuck.setFlyBehaior(new FlyNoWay());
        mallarDuck.setQuackBehavior(new MuteQuack());

        for (int i = 0; i < 20; i++) {
            mallarDuck.setAge(i);
            if (mallarDuck.getAge() == 3) {
                mallarDuck.setFlyBehaior(new FlyWithWings());
            }
            if (mallarDuck.getAge() == 5) {
                mallarDuck.setQuackBehavior(new Quack());
            }
        }

    }
}
