package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 16:47
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double price = 0;
        if (beverage.getSize().equals("tall")) {
            price = 0.10;
        } else if (beverage.getSize().equals("grande")) {
            price = 0.15;
        } else {
            price = 0.20;
        }
        return beverage.cost() + price;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，豆浆";
    }
}
