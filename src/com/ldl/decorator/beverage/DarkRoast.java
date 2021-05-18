package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 15:13
 */
public class DarkRoast extends Beverage {

    public DarkRoast(String size) {
        description = "深焙";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
