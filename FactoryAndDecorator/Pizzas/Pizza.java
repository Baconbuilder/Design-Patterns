package Pizzas;

import Product.Meals;

public abstract class Pizza extends Meals {
    String info = "";

    @Override
    public String getDescription() {
        return info;
    }

}
