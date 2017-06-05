package com.hodue.decorator.starbuzz.decorator;

import com.hodue.decorator.starbuzz.Beverage;

/**
 *
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 13:59
 */
public class Whip  extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
