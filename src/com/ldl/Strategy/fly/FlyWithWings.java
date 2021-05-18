package com.ldl.Strategy.fly;

/**
 * @Author ldl
 * @Date 2021/5/12 23:08
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
