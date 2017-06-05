package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.QuackBehavior;

/**
 * 呱呱叫
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 09:23
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
