package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.impl.FlyNoWay;
import com.hodue.strategy.behavior.impl.MuteQuack;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:01
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }

}
