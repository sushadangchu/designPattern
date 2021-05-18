package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:40
 */
public class Decaf extends Beverage {

    public Decaf(String size) {
        description = "低咖啡因";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
