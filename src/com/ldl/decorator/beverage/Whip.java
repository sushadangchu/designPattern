package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:49
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，奶泡";
    }
}
