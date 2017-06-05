package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.impl.FlyNoWay;
import com.hodue.strategy.behavior.impl.Quack;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:17
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
