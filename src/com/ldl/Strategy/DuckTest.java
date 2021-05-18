package com.ldl.Strategy;

import com.ldl.Strategy.duck.Duck;
import com.ldl.Strategy.duck.MallardDuck;
import com.ldl.Strategy.duck.ModelDuck;
import com.ldl.Strategy.duck.RubberDuck;
import com.ldl.Strategy.fly.FlyRocketPowered;

/**
 * @Author ldl
 * @Date 2021/5/12 23:19
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.fly();
    }
}
