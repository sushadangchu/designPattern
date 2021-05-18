package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:44
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，摩卡";
    }
}
