package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.QuackBehavior;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:03
 */
public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}
