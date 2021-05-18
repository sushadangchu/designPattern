package com.ldl.facotry.store;

import com.ldl.facotry.ingredient.NYPizzaIngredientFactory;
import com.ldl.facotry.ingredient.PizzaIngredientFactory;
import com.ldl.facotry.pizza.*;

/**
 * @Author ldl
 * @Date 2021/5/18 15:48
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (name.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (name.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (name.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
