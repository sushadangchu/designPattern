package com.ldl.Strategy.fly;

/**
 * @Author ldl
 * @Date 2021/5/12 23:10
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
