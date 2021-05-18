package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 15:21
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + "，牛奶";
    }
}
