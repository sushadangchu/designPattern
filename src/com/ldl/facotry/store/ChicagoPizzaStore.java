package com.ldl.facotry.store;

import com.ldl.facotry.ingredient.ChicagoPizzaIngredientFactory;
import com.ldl.facotry.ingredient.NYPizzaIngredientFactory;
import com.ldl.facotry.ingredient.PizzaIngredientFactory;
import com.ldl.facotry.pizza.*;

/**
 * @Author ldl
 * @Date 2021/5/18 15:48
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (name.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (name.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (name.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
