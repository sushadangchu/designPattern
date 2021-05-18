package com.ldl.Strategy.quack;

/**
 * @Author ldl
 * @Date 2021/5/12 23:11
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("呱呱");
    }
}
