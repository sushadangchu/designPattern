package com.ldl.facotry.ingredient;

import com.ldl.facotry.ingredient.cheese.Cheese;
import com.ldl.facotry.ingredient.cheese.ReggianoCheese;
import com.ldl.facotry.ingredient.clams.Clams;
import com.ldl.facotry.ingredient.clams.FreshClams;
import com.ldl.facotry.ingredient.dough.Dough;
import com.ldl.facotry.ingredient.dough.ThinCrustDough;
import com.ldl.facotry.ingredient.pepperoni.Pepperoni;
import com.ldl.facotry.ingredient.pepperoni.SlicedPepperoni;
import com.ldl.facotry.ingredient.sauce.MarinaraSauce;
import com.ldl.facotry.ingredient.sauce.Sauce;
import com.ldl.facotry.ingredient.veggies.*;

/**
 * @Author ldl
 * @Date 2021/5/18 15:37
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
