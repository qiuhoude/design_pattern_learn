package com.hodue.observer.custom;

/**
 * 主题类, 也可以叫做被观察的对象
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-06-09
 * Time: 06:41
 */
public interface Subject {

    /**
     * 订阅
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 取消订阅
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
