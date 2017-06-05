package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.impl.FlyWithWings;
import com.hodue.strategy.behavior.impl.Quack;

/**
 * 野鸭
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:03
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
