package com.ldl.facotry.ingredient;

import com.ldl.facotry.ingredient.cheese.Cheese;
import com.ldl.facotry.ingredient.cheese.MozzarellaCheese;
import com.ldl.facotry.ingredient.clams.Clams;
import com.ldl.facotry.ingredient.clams.FrozenClams;
import com.ldl.facotry.ingredient.dough.Dough;
import com.ldl.facotry.ingredient.dough.ThickCrustDough;
import com.ldl.facotry.ingredient.pepperoni.Pepperoni;
import com.ldl.facotry.ingredient.pepperoni.SlicedPepperoni;
import com.ldl.facotry.ingredient.sauce.PlumTomatoSauce;
import com.ldl.facotry.ingredient.sauce.Sauce;
import com.ldl.facotry.ingredient.veggies.*;

/**
 * @Author ldl
 * @Date 2021/5/18 15:37
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
