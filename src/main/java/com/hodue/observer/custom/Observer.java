package com.hodue.observer.custom;

/**
 * 观察者
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-06-09
 * Time: 06:43
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
