package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:38
 */
public class HouseBlend extends Beverage {

    public HouseBlend(String size) {
        description = "综合咖啡";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
