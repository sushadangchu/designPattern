package com.ldl.Strategy.duck;

import com.ldl.Strategy.fly.FlyBehavior;
import com.ldl.Strategy.quack.QuackBehavior;

/**
 * @Author ldl
 * @Date 2021/5/12 23:03
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("游泳");
    }

    public void display() {
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
