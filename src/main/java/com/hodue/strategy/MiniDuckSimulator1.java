package com.hodue.strategy;

import com.hodue.strategy.behavior.impl.FlyRocketPowered;
import com.hodue.strategy.duck.Duck;
import com.hodue.strategy.duck.MallardDuck;
import com.hodue.strategy.duck.ModelDuck;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 11:11
 */
public class MiniDuckSimulator1 {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        //动态的修改鸭子的行为
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
