package com.hodue.strategy.behavior.impl;

import com.hodue.strategy.behavior.QuackBehavior;

/**
 * 橡皮鸭子吱吱叫
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 09:39
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
