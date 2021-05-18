package com.ldl.facotry.pizza;

import com.ldl.facotry.ingredient.cheese.Cheese;
import com.ldl.facotry.ingredient.clams.Clams;
import com.ldl.facotry.ingredient.dough.Dough;
import com.ldl.facotry.ingredient.pepperoni.Pepperoni;
import com.ldl.facotry.ingredient.sauce.Sauce;
import com.ldl.facotry.ingredient.veggies.Veggies;

/**
 * @Author ldl
 * @Date 2021/5/18 14:52
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
