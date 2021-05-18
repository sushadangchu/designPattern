package com.ldl.Strategy.duck;

import com.ldl.Strategy.fly.FlyWithWings;
import com.ldl.Strategy.quack.Quack;

/**
 * @Author ldl
 * @Date 2021/5/12 23:07
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("绿头鸭");
    }
}
