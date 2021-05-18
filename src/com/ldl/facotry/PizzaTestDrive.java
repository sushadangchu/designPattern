package com.ldl.facotry;

import com.ldl.facotry.pizza.Pizza;
import com.ldl.facotry.store.ChicagoPizzaStore;
import com.ldl.facotry.store.NYPizzaStore;
import com.ldl.facotry.store.PizzaStore;

/**
 * @Author ldl
 * @Date 2021/5/18 15:57
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyCheesePizza.getName());

        Pizza chicagoClamPizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println(chicagoClamPizza.getName());
    }
}
