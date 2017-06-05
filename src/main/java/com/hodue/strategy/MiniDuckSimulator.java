package com.hodue.strategy;

import com.hodue.strategy.behavior.impl.FlyRocketPowered;
import com.hodue.strategy.duck.DecoyDuck;
import com.hodue.strategy.duck.MallardDuck;
import com.hodue.strategy.duck.ModelDuck;
import com.hodue.strategy.duck.RubberDuck;

/**
 * 测试类
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-05-30
 * Time: 10:55
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
