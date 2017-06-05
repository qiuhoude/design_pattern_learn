package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.FlyBehavior;

/**
 * 不会飞的行为
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 09:59
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
