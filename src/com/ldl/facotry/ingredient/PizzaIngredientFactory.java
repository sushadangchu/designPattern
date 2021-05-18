package com.ldl.facotry.ingredient;

import com.ldl.facotry.ingredient.cheese.Cheese;
import com.ldl.facotry.ingredient.clams.Clams;
import com.ldl.facotry.ingredient.dough.Dough;
import com.ldl.facotry.ingredient.pepperoni.Pepperoni;
import com.ldl.facotry.ingredient.sauce.Sauce;
import com.ldl.facotry.ingredient.veggies.Veggies;

/**
 * @Author ldl
 * @Date 2021/5/18 15:00
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
