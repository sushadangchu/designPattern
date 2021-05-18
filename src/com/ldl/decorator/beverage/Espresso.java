package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:37
 */
public class Espresso extends Beverage {

    public Espresso(String size) {
        description = "浓缩咖啡";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
