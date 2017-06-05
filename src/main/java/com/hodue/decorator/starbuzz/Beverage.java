package com.hodue.decorator.starbuzz;

/**
 * 饮料的基类
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 13:43
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();

}
