package com.ldl.Strategy.duck;

import com.ldl.Strategy.fly.FlyWithWings;
import com.ldl.Strategy.quack.Quack;
import com.ldl.Strategy.quack.Squeak;

/**
 * @Author ldl
 * @Date 2021/5/12 23:15
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("红头鸭");
    }
}
