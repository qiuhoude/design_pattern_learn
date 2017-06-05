package com.hodue.decorator.starbuzz.decorator;

import com.hodue.decorator.starbuzz.Beverage;

/**
 * 调料装饰基类
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 13:56
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
