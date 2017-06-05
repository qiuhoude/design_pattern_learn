package com.hodue.strategy.duck;

import com.hodue.strategy.behavior.FlyBehavior;
import com.hodue.strategy.behavior.QuackBehavior;

/**
 * 鸭子的父类
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 09:23
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
