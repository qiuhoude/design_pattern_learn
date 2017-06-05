package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.FlyBehavior;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:01
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
