package com.hodue.decorator.starbuzz.decorator;

import com.hodue.decorator.starbuzz.Beverage;

/**
 * 加奶 调料装饰
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 13:55
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
