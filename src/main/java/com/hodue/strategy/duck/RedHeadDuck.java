package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.impl.FlyWithWings;
import com.hodue.strategy.behavior.impl.Quack;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:53
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
