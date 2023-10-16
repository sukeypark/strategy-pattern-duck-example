package com.example;

import com.example.duck.MallardDuck;
import com.example.duck.RedheadDuck;

public class App {
    public static void main(String[] args) throws Exception {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();

        mallardDuck.performQuack();
        redheadDuck.performQuack();

        mallardDuck.swim();
        redheadDuck.swim();

        mallardDuck.display();
        redheadDuck.display();
    }
}
