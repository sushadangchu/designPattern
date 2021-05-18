package com.ldl.Strategy.fly;

/**
 * @Author ldl
 * @Date 2021/5/12 23:21
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("火箭飞行");
    }
}
