package com.ldl.facotry.store;

import com.ldl.facotry.pizza.Pizza;

/**
 * @Author ldl
 * @Date 2021/5/18 14:50
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String name) {
        Pizza pizza = createPizza(name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String name);
}
