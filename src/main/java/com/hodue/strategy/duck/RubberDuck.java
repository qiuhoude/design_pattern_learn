package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.impl.FlyNoWay;
import com.hodue.strategy.behavior.impl.Squeak;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:54
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
