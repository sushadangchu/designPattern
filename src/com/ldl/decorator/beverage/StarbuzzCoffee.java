package com.ldl.decorator.beverage;

/**
 * @Author ldl
 * @Date 2021/5/14 15:18
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso("tall");
        System.out.println(beverage.getDescription() + " ￥" + beverage.cost());

        Beverage beverage2 = new DarkRoast("tall");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " ￥" + beverage2.cost());

        Beverage beverage3 = new HouseBlend("tall");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " ￥" + beverage3.cost());
    }
}
