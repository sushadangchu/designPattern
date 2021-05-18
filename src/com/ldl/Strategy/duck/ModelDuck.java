package com.ldl.Strategy.duck;

import com.ldl.Strategy.fly.FlyNoWay;
import com.ldl.Strategy.fly.FlyWithWings;
import com.ldl.Strategy.quack.MuteQuack;
import com.ldl.Strategy.quack.Quack;

/**
 * @Author ldl
 * @Date 2021/5/12 23:21
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("模型鸭");
    }
}
