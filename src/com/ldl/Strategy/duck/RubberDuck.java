package com.ldl.Strategy.duck;

import com.ldl.Strategy.fly.FlyNoWay;
import com.ldl.Strategy.fly.FlyWithWings;
import com.ldl.Strategy.quack.Quack;
import com.ldl.Strategy.quack.Squeak;

/**
 * @Author ldl
 * @Date 2021/5/12 23:16
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("橡皮鸭");
    }
}
