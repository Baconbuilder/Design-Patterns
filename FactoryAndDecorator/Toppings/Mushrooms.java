package Toppings;

import Decoration.ToppingDecorator;
import Pizzas.Pizza;

public class Mushrooms extends ToppingDecorator {
    Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public int cost() {
        return 40 + pizza.cost();
    }
}
