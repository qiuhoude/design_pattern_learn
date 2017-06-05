package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.QuackBehavior;

/**
 * 什么都不做,不会叫
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 09:43
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");//沉默
    }
}
