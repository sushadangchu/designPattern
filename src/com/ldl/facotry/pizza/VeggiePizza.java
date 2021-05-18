package com.ldl.facotry.pizza;

import com.ldl.facotry.ingredient.PizzaIngredientFactory;

/**
 * @Author ldl
 * @Date 2021/5/18 14:59
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;


    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
