package com.ldl.Strategy.quack;

/**
 * @Author ldl
 * @Date 2021/5/12 23:12
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
