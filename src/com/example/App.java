package com.example;

import com.example.duck.Duck;
import com.example.duck.MallardDuck;
import com.example.duck.RedheadDuck;

public class App {
    public static void main(String[] args) throws Exception {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        mallardDuck.quack();
        redheadDuck.quack();

        mallardDuck.swim();
        redheadDuck.swim();

        mallardDuck.display();
        redheadDuck.display();
    }
}
