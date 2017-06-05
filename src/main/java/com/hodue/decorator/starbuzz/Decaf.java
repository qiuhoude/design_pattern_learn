package com.hodue.decorator.starbuzz;

/**
 * 脱咖啡因的 咖啡类型
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 13:50
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
